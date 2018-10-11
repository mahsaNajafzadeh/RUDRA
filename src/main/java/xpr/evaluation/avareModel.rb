class Category < ActiveRecord::Base
  validates :code,  :presence => true, :length => { :minimum => 1, :maximum => 20 }, :uniqueness => true
  validates :name, :presence => true, :length => { :minimum => 1, :maximum => 100 }, :uniqueness => true
  validates :description, :presence => true, :length => { :minimum => 1, :maximum => 255 }
end
class User < ActiveRecord::Base
  validates_presence_of :name
  validates_uniqueness_of :name, :email, :case_sensitive => false
end

class Upload < ActiveRecord::Base
  belongs_to :User

  validates :entity,            :presence => true,  :length => { :minimum => 1, :maximum => 100 }
  validates :unit,                                  :length => { :minimum => 0, :maximum => 10  }
  validates :quantity,          :presence => true, :numericality => { :greater_then_or_equal_to => 0}
  validates :price_with_vat,    :presence => true, :numericality => { :greater_then_or_equal_to => 0 }
  validates :coast_of_delivery, :presence => true, :numericality => { :greater_then_or_equal_to => 0 }
  validates :supplier,          :length => { :maximum => 100 }
  validates :master_project,    :length => { :maximum => 100 }
  validates :slave_project,     :length => { :maximum => 100 }
  end

class Project < ActiveRecord::Base
  validates :code, :presence => true, :length => { :minimum => 1, :maximum => 20 }, :uniqueness => true
  validates :name, :presence => true, :length => { :minimum => 1, :maximum => 100 }, :uniqueness => true
  validates :description, :presence => true, :length => { :minimum => 1, :maximum => 255 }
end


class SpecificationLog < ActiveRecord::Base
  belongs_to :specification
  belongs_to :category
  belongs_to :project
  belongs_to :User
end

class Specification < ActiveRecord::Base
  belongs_to :category
  belongs_to :project
  belongs_to :User
  has_many :specification_logs, :order => 'id DESC'
  validates :entity,            :presence => true, :length => { :minimum => 1, :maximum => 100 }
  validates :supplier,          :length => { :minimum => 0, :maximum => 100 }
  validates :unit,              :length => { :minimum => 0, :maximum => 10  }
  validates :quantity,          :presence => true, :numericality => { :greater_then_or_equal_to => 0.0 }
  validates :price_with_vat,    :presence => true, :numericality => { :greater_then_or_equal_to => 0.0 }
  validates :coast_of_delivery, :presence => true, :numericality => { :greater_then_or_equal_to => 0.0 }
  validates :notice,                  :length => { :minimum => 0, :maximum => 255 }
  validates :recommended_conditions,  :length => { :minimum => 0, :maximum => 255 }
  validates :recommended_supplier,    :length => { :minimum => 0, :maximum => 255 }
  validates :recommended_notice,      :length => { :minimum => 0, :maximum => 255 }
  validates :category, :project, :user, :presence => true
end