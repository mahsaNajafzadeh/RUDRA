class Account < ApplicationRecord
  belongs_to :user

  validates_presence_of :name, :user

  def self.open(params)
    demarcation_presence(user)
    account = new(params)
    puts "Creating a account with #{account.attributes}"
  end
    def  demarcation_presence(user)
    user=User.find(user)
      if(user.nil?)
      user=User.create()
             end
             end
  end
end
class User < ApplicationRecord
 has_many :accounts, dependent: :destroy
  def create
    user = new(params)
    user.save!
  end
  def remove
    destroy
  end
end


