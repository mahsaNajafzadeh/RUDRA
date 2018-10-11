class Accessorisation < ActiveRecord::Base
  belongs_to :accessory
  belongs_to :product

end

class Accessory < ActiveRecord::Base
  has_many :cart_item_accessories
  has_many :cart_items,                                   through: :cart_item_accessories
  has_many :carts,                                        through: :cart_items
  has_many :orderitemaccessory,                       dependent: :restrict_with_exception
  has_many :order_items,                                  through: :order_item_accessories, dependent: :restrict_with_exception
  has_many :orders,                                       through: :order_items
  has_many :accessorisation,                             dependent: :destroy
  has_many :products,                                     through: :accessorisations
  validates :name, :part_number, :weight, :price,         presence: true, uniqueness: true

end


class Attachment < ActiveRecord::Base
  validates :file,                  presence: true
  end

class User < ActiveRecord::Base
    has_one :attachment,    dependent: :destroy
    has_many :permissions,         dependent: :destroy
    has_many :roles,        through: :permissions
    has_many :notifications, dependent: :destroy
end

class Sku < ActiveRecord::Base
  has_many :notifications,              dependent: :destroy
  has_many :stock_adjustments,        dependent: :destroy
  has_many :variants,         dependent: :destroy

  validates :length, :weight, :thickness,    numericality: { greater_than_or_equal_to : 0 }
  validates :stock, :stock_warning_level,           presence: true, numericality: { greater_than_or_equal_to : 1 }
  validates :code,                   uniqueness:true
end

class Address < ActiveRecord::Base
  belongs_to :order
  has_one :address_country,                                         dependent: :destroy
  has_one :country
  end
  class Cart < ActiveRecord::Base
    belongs_to :DeliveryServicePrice
    has_many :cart_items,                             dependent: :destroy
    has_many :cart_item_accessories
    has_many :skus
    has_one :order
end

class CartItemAccessory < ActiveRecord::Base
  belongs_to :cartitem
  belongs_to :accessory

end

class Category < ActiveRecord::Base
  has_many :products
  has_many :skus,                                        through: :products
  has_many :attachments,                                 through: :products
  validates :name,                                       uniqueness: true
  validates :sorting,    numericality: { greater_than_or_equal_to : 0 }
  end

  class Page < ActiveRecord::Base
      validates :title, :slug, :menu_title,          uniqueness: true
      end


class address < ActiveRecord::Base
    belongs_to :address
    belongs_to :country
    validates :address_id,           uniqueness: true
    validates :country,                    presence: true
end

class Country < ActiveRecord::Base
	has_many :destinations,                               dependent: :destroy
	has_many :deliveryservice,                          through: :destinations
    has_many :address_countries,                          dependent: :destroy
    has_many :addresses,                                  through: :address_countries
    has_many :orders,                                     through: :delivery_addresses
    has_many :products,                                   through: :orders
	validates :name, :alpha_two_code,                     presence: true,  uniqueness: true
end

class DeliveryService < ActiveRecord::Base
    has_many :DeliveryServicePrice,                         dependent: :destroy
    has_many :destinations,                                 dependent: :destroy
    has_many :countries,                                    through: :destinations
    has_many :orders
    validates :name,                                        uniqueness: true
    end

class DeliveryServicePrice < ActiveRecord::Base
  has_many :orders,    dependent: :restrict_with_exception
  belongs_to :deliveryservice
  has_many :countries
  validates :code,            uniqueness: true
  validates :deliveryservice,                     presence: true
 end

class Destination < ActiveRecord::Base
  belongs_to :country
  belongs_to :deliveryservice
end

class Order < ActiveRecord::Base
 	has_many :orderitems,                                                dependent: :destroy
 	has_many :transactions,                                               dependent: :destroy
 	has_many :products,                                                   through: :order_items
 	has_many :skus,                                                       through: :order_items

 	belongs_to :cart
 	belongs_to :DeliveryService
 	has_one :delivery_service
 	 validates :cart,                     presence: true
 	  validates :DeliveryService,                     presence: true
     validates :payment_type,                                              presence: true
     validate :tracking_assignment

end

class OrderItem < ActiveRecord::Base
    belongs_to :sku
    belongs_to :order
    has_one :order_item_accessory,            dependent: :delete
    has_one :product
end

class OrderItemAccessory < ActiveRecord::Base
    belongs_to :orderitem
    belongs_to :accessory
end

class Product < ActiveRecord::Base
 belongs_to :category
  has_many :sku,             dependent: :destroy
  has_many :variants
  has_many :active_skus
  has_many :SkuVariant
  has_many :orders,                                           through: :skus
  has_many :cart,                                            through: :skus
  has_many :tagging,                                         dependent: :destroy
  has_many :tag,                                           dependent: :destroy
  has_many :attachment,                                     dependent: :destroy
  has_many :accessorisation,                                 dependent: :destroy
  has_many :accessory,                                      through: :accessorisations
  has_and_belongs_to_many :Product

  validates :part_number, :sku, :name,                        uniqueness: true
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
    has_many :sku,
    validates :name,                        presence: true
end
class Tagging < ActiveRecord::Base
    belongs_to :product
   belongs_to :tag
    validates :tag_id,                    uniqueness: true
end

class StoreSetting < ActiveRecord::Base
 has_one :attachment,     dependent: :destroy
    end

    class Tag < ActiveRecord::Base
      has_many :tagging,                       dependent: :destroy
      has_many :product,                       through: :taggings
      end

class StockAdjustment < ActiveRecord::Base
  belongs_to :sku
  validates :description, :adjustment, :adjusted_at,             presence: true
end


class SkuVariant < ActiveRecord::Base
    belongs_to :sku
    belongs_to :VariantType
    validates :name,                                presence: true
 end

class Role < ActiveRecord::Base
    has_many :permission,                      dependent: :destroy
    has_many :user,                            through: :permissions
end

class RelatedProduct < ActiveRecord::Base
    belongs_to :product
    validates :related_id,              uniqueness: true
end

class Notification < ActiveRecord::Base
  end

class ContactMessage < ActiveRecord::Base
    validates :name, :message,          presence: true
    end


