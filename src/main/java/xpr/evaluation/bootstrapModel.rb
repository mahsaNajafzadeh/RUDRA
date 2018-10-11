class Role < ActiveRecord::Base
  has_and_belongs_to_many :users
  belongs_to :resource
end
class User < ActiveRecord::Base
end
