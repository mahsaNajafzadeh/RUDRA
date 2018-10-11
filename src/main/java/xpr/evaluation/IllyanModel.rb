class Group < ActiveRecord::Base
  has_and_belongs_to_many :people
  has_and_belongs_to_many :Person
end

class Person < ActiveRecord::Base
  validates_uniqueness_of :email,
  has_and_belongs_to_many :groups
  has_and_belongs_to_many :services
  end

  class Service < ActiveRecord::Base
    has_and_belongs_to_many :person
    end