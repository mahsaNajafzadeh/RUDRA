class List < ActiveRecord::Base
  belongs_to :user
end


class Setting < ActiveRecord::Base

end

class User < ActiveRecord::Base
  has_one :avatar, dependent: :destroy
  has_many :accounts
  has_many :campaigns
  has_many :leads
  has_many :contacts
  has_many :opportunities
  has_many :Opportunity
  has_many :permission, dependent: :destroy
  has_many :preference, dependent: :destroy
  has_many :lists
  has_and_belongs_to_many :groups

  validates :email,  uniqueness: true
  validates :username,    uniqueness: true

end

class Preference < ActiveRecord::Base
  belongs_to :user
end

class Permission < ActiveRecord::Base
  belongs_to :user
  belongs_to :group

   validates :group,   presence: true
    validates :user,   presence: true

  validates_uniqueness_of :user,


end
class Group < ActiveRecord::Base
  has_and_belongs_to_many :users
  has_many :permissions

  validates :name, presence: true, uniqueness: true


end
class Task < ActiveRecord::Base
  belongs_to :user
  belongs_to :asset
   validates :user,   presence: true
end

class Email < ActiveRecord::Base
  belongs_to :user

end

class Comment < ActiveRecord::Base
  belongs_to :user

   validates :user,   presence: true

end


class Avatar < ActiveRecord::Base
  belongs_to :user
end


class Address < ActiveRecord::Base

end


class FieldGroup < ActiveRecord::Base
  has_many :fields
  belongs_to :tag

  validates_presence_of :label

end



class Field < ActiveRecord::Base


  belongs_to :fieldgroup


  validates_presence_of :label

  validates_numericality_of :minlength, less_than_or_equal_to: :maxlength

end


class Account < ActiveRecord::Base
  belongs_to :user
  has_many :accountcontact, dependent: :destroy
  has_many :contacts
  has_many :account_opportunity, dependent: :destroy
  has_many :opportunities
  has_many :pipeline_opportunities
  has_many :tasks, dependent: :destroy
  has_one :billing_addres,  dependent: :destroy
  has_one :shipping_addres, dependent: :destroy
  has_many :addresse, dependent: :destroy
  has_many :emails


  validates_uniqueness_of :name,
  validate :users_for_shared_access

  def users_for_shared_access
     if self[:access] == "Shared"
    end

end


class AccountContact < ActiveRecord::Base
  belongs_to :account
  belongs_to :contact

   validates :account,   presence: true

end

class AccountOpportunity < ActiveRecord::Base
  belongs_to :account
  belongs_to :opportunity

     validates :account,   presence: true
        validates :opportunity,   presence: true

end

class Campaign < ActiveRecord::Base
  belongs_to :user
  has_many :task, dependent: :destroy
  has_many :lead, dependent: :destroy
  has_many :opportunity, dependent: :destroy
  has_many :emails

  validates_uniqueness_of :name,
end



class Contact < ActiveRecord::Base
  belongs_to :user
  belongs_to :lead
  has_one :account_contact, dependent: :destroy
  has_one :account
  has_many :contactopportunity, dependent: :destroy
  has_many :opportunity
  has_many :task, dependent: :destroy
  has_one :address, dependent: :destroy
  has_many :email

  validates :lead,   presence: true
  end


class ContactOpportunity < ActiveRecord::Base
  belongs_to :contact
  belongs_to :opportunity
   validates :contact,   presence: true
      validates :opportunity,   presence: true
end

class Lead < ActiveRecord::Base
  belongs_to :user
  belongs_to :campaign
  has_one :contact, dependent: :nullify
  has_many :task, dependent: :destroy
  has_one :address, dependent: :destroy
  has_many :addresses, dependent: :destroy
  has_many :emails
     validates :campaign,   presence: true
end

class Opportunity < ActiveRecord::Base
  belongs_to :user
  belongs_to :campaign
  has_one :account_opportunity, dependent: :destroy
  has_one :account
  has_many :contact_opportunities, dependent: :destroy
  has_many :contacts
  has_many :tasks, dependent: :destroy
  has_many :emails

end



