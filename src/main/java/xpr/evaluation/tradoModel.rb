class Accessorisation < ActiveRecord::Base
  attr_accessible :accessory_id, :product_id
  belongs_to :accessory
  belongs_to :product

end

class Accessory < ActiveRecord::Base
  attr_accessible :name, :part_number, :price, :weight, :cost_value, :active
  has_many :cart_item_accessories
  has_many :cart_items,                                   through: :cart_item_accessories
  has_many :carts,                                        through: :cart_items
  has_many :order_item_accessories,                       dependent: :restrict_with_exception
  has_many :order_items,                                  through: :order_item_accessories, dependent: :restrict_with_exception
  has_many :orders,                                       through: :order_items
  has_many :accessorisations,                             dependent: :destroy
  has_many :products,                                     through: :accessorisations
  validates :name, :part_number, :weight, :price,         presence: true, uniqueness: { scope: :active }

end


class Attachment < ActiveRecord::Base
  belongs_to :attachable,           polymorphic: true
  validates :file,                  presence: true
  end

class User < ActiveRecord::Base
    has_one :attachment,                                    as: :attachable, dependent: :destroy
    has_many :permissions,                                  dependent: :destroy
    has_many :roles,                                        through: :permissions
    has_many :notifications,                                as: :notifiable, dependent: :destroy
end

class Sku < ActiveRecord::Base
  has_many :notifications,                                            as: :notifiable, dependent: :destroy
  has_many :stock_adjustments,                                        dependent: :destroy
  has_many :variants,                                                 dependent: :destroy

  validates :length, :weight, :thickness,                             numericality: { greater_than_or_equal_to: 0 }
  validates :stock, :stock_warning_level,                             presence: true, numericality: { greater_than_or_equal_to: 1 }
  validates :code,                                                    uniqueness:true
  end

class Address < ActiveRecord::Base
   belongs_to :order
  belongs_to :addressable,                                          polymorphic: true
  has_one :address_country,                                         dependent: :destroy
  has_one :country,                                                 through: :address_country
  validates :first_name, :last_name,
  :address, :city, :postcode,                                       presence: true
  end
  class Cart < ActiveRecord::Base

    has_many :cart_items,                             dependent: :destroy
    has_many :cart_item_accessories,                  through: :cart_items
    has_many :skus,                                   through: :cart_items
    has_one :order
    belongs_to :delivery,                             class_name: 'DeliveryServicePrice'
end

class CartItemAccessory < ActiveRecord::Base
  belongs_to :cart_item
  belongs_to :accessory

end

class Category < ActiveRecord::Base
  has_many :products
  has_many :skus,                                        through: :products
  has_many :attachments,                                 through: :products
  validates :name,                                       uniqueness: true
  validates :sorting,    numericality: { only_integer: true, greater_than_or_equal_to: 0 }
  end

  class Page < ActiveRecord::Base
      validates :title, :slug, :menu_title,          uniqueness: true
      end


class AddressCountry < ActiveRecord::Base
    belongs_to :address
    belongs_to :country
    validates :address_id,                    uniqueness: { scope: :country_id }
    validates :country_id,                    presence: true
end

class Country < ActiveRecord::Base
	has_many :destinations,                               dependent: :destroy
	has_many :delivery_services,                          through: :destinations
    has_many :address_countries,                          dependent: :destroy
    has_many :addresses,                                  through: :address_countries
    has_many :orders,                                     through: :delivery_addresses
    has_many :products,                                   through: :orders
	validates :name, :alpha_two_code,                     uniqueness: true, presence: true
end

class DeliveryService < ActiveRecord::Base
    has_many :prices,                                       class_name: 'DeliveryServicePrice', dependent: :destroy
    has_many :destinations,                                 dependent: :destroy
    has_many :countries,                                    through: :destinations
    has_many :orders,                                       through: :prices
    validates :name,                                        uniqueness:
    end

class DeliveryServicePrice < ActiveRecord::Base
  has_many :orders,                                                     foreign_key: :delivery_id, dependent: :restrict_with_exception
  belongs_to :delivery_service
  has_many :countries,                                                  through: :delivery_service
  validates :code,                                                      uniqueness: { scope: [:active, :delivery_service_id] }
 end

class Destination < ActiveRecord::Base
  belongs_to :country
  belongs_to :delivery_service
end

class Order < ActiveRecord::Base
 	has_many :order_items,                                                dependent: :destroy
 	has_many :transactions,                                               dependent: :destroy
 	has_many :products,                                                   through: :order_items
 	has_many :skus,                                                       through: :order_items

 	belongs_to :cart
 	belongs_to :delivery,                                                 class_name: 'DeliveryServicePrice'
 	has_one :delivery_service,                                            through: :delivery
     validates :payment_type,                                              presence: true
     validate :tracking_assignment

end

class OrderItem < ActiveRecord::Base
    belongs_to :sku
    belongs_to :order
    has_one :order_item_accessory,            dependent: :delete
    has_one :product,                         through: :sku
end

class OrderItemAccessory < ActiveRecord::Base
    belongs_to :order_item
    belongs_to :accessory
end

class Product < ActiveRecord::Base

  has_many :skus,                                             dependent: :destroy, inverse_of: :product
  has_many :variants,                                         through: :skus, class_name: 'SkuVariant'
  has_many :variant_types,
  has_many :active_skus,
  has_many :active_sku_variants,                              through: :active_skus, class_name: 'SkuVariant', source: :variants
  has_many :orders,                                           through: :skus
  has_many :carts,                                            through: :skus
  has_many :taggings,                                         dependent: :destroy
  has_many :tags,                                             through: :taggings, dependent: :destroy
  has_many :attachments,                                      as: :attachable, dependent: :destroy
  has_many :accessorisations,                                 dependent: :destroy
  has_many :accessories,                                      through: :accessorisations
  has_and_belongs_to_many :related,                           class_name: "Product"

  belongs_to :category

  validates :name, :sku, :part_number,                        presence: true
  validates :meta_description, :description,
  :weighting, :category_id, :page_title,                      presence: true, if: :published?
  validates :part_number, :sku, :name,                        uniqueness: { scope: :active }
  end

class Transaction < ActiveRecord::Base
    belongs_to :order
end


class Permission < ActiveRecord::Base
  belongs_to :user
  belongs_to :role
end

class VariantType < ActiveRecord::Base
   has_many :sku_variants
    has_many :skus,                         through: :sku_variants
    validates :name,                        presence: true
end
class Tagging < ActiveRecord::Base
    belongs_to :product
   belongs_to :tag
    validates :tag_id,                    uniqueness: { scope: :product_id }
end

class StoreSetting < ActiveRecord::Base
 has_one :attachment,                                                  as: :attachable, dependent: :destroy
    validates :name, :email, :tax_name, :currency,
    :tax_rate, :theme_name, :locale,                                      presence: true
    end

    class Tag < ActiveRecord::Base
      has_many :taggings,                       dependent: :destroy
      has_many :products,                       through: :taggings
      end

class StockAdjustment < ActiveRecord::Base
  belongs_to :sku
  validates :description, :adjustment, :adjusted_at,             presence: true
  validate :adjustment_value
end


class SkuVariant < ActiveRecord::Base
    belongs_to :sku,                                inverse_of: :variants
    belongs_to :variant_type,                       class_name: 'VariantType'
    validates :name,                                presence: true
 end

class Role < ActiveRecord::Base
    has_many :permissions,                      dependent: :destroy
    has_many :users,                            through: :permissions
end

class RelatedProduct < ActiveRecord::Base
    belongs_to :product
    validates :related_id,              uniqueness: { scope: :product_id }
end

class Notification < ActiveRecord::Base
  belongs_to :notifiable
  end


class ContactMessage
    validates :name, :message,                                              presence: true
    end


