class Account < ActiveRecord::Base

  has_many :import_contacts

  has_many :contact, :dependent => :destroy
  has_many :opportunity, :dependent => :destroy
  has_many :quotation, :dependent => :destroy
  has_many :event, :dependent => :destroy
  has_many :task, :dependent => :destroy
  has_many :document, :dependent => :destroy
  has_many :contract, :dependent => :destroy

  has_and_belongs_to_many :tag
  belongs_to :user
  belongs_to :origin
  belongs_to :import
  belongs_to :activity
  belongs_to :paymentterm

  validates :import, presence: true
  validates :origin, presence: true
end

class Activity < ActiveRecord::Base
  validates :name, uniqueness: true
  has_many :account
  belongs_to :User
end

class CampaignLine < ActiveRecord::Base

  belongs_to :campaign
  belongs_to :contact
  belongs_to :account

  belongs_to: :user
end

class Alias < ActiveRecord::Base
  belongs_to :contact
  belongs_to :email
  validates :email, presence: true
end
class Campaign < ActiveRecord::Base
  has_many :campaign_line, :dependent => :destroy
  belongs_to :eventtype
  belongs_to :User
end
class CampaignResultStage < ActiveRecord::Base

  validates :name, uniqueness: true

  has_many :campaign_lines
  belongs_to :User

end

class Contact < ActiveRecord::Base

  has_many :import_contact

  has_many :tasks
  has_many :aliase, dependent: :destroy

  has_and_belongs_to_many :tags

  belongs_to :account
  belongs_to :user
  belongs_to :import

  validates :account, :presence => true

end

class Contract < ActiveRecord::Base

  belongs_to :contract_category
  belongs_to :account
  belongs_to :User
  has_many :contractattachment, :dependent => :destroy
  validates :account, :presence => true
end

class ContractAttachment < ActiveRecord::Base
    belongs_to :contract
end

class ContractCategory < ActiveRecord::Base

  validates :name, uniqueness: true

  has_many :contracts
  belongs_to :user
end

class Document < ActiveRecord::Base

  belongs_to :account
  belongs_to :user


  validates :account, :presence => true

end

class DocumentAttachment < ActiveRecord::Base
    belongs_to :document
end

class Email < ActiveRecord::Base
  belongs_to :contact
  belongs_to :account
  has_many :emailattachment, :dependent => :destroy
end

class EmailAttachment < ActiveRecord::Base
  belongs_to :email

end

class Event < ActiveRecord::Base

  belongs_to :contact
  belongs_to :account
  belongs_to :event_type
  belongs_to :user
  belongs_to :task
  belongs_to :opportunity
  belongs_to :quotation


  has_many :eventattachment, :dependent => :destroy

  validates :account, :presence => true
  validates :contact, :presence => true

end

class EventAttachment < ActiveRecord::Base
    belongs_to :event
end

class EventType < ActiveRecord::Base

  has_many :event
  has_many :task
  belongs_to :user

end

class Import < ActiveRecord::Base
  has_many :account, :dependent => :destroy
  has_many :importaccount, :dependent => :destroy
  has_many :contact, :dependent => :destroy
  has_many :importcontact, :dependent => :destroy
  belongs_to :user
end

class ImportAccount < ActiveRecord::Base

  belongs_to :user
  belongs_to :anomaly
  belongs_to :account
  belongs_to :import
  belongs_to :origin
end

class ImportContact < ActiveRecord::Base


  belongs_to :account
  belongs_to :contact
  belongs_to :anomaly
  belongs_to :user
  belongs_to :import
end



class Opportunity < ActiveRecord::Base

  belongs_to :contact
  belongs_to :account
  belongs_to :user
  has_many :events

  validates :account, :presence => true
  validates :contact, :presence => true
end

class OpportunityAttachment < ActiveRecord::Base
    belongs_to :opportunity

end

class Origin < ActiveRecord::Base

  validates :name, uniqueness: true

  has_many :account
  has_many :import
  has_many :import_account
  belongs_to :user
end


class PaymentMode < ActiveRecord::Base

  validates :name, uniqueness: true

  has_many :paymentterms
  belongs_to :user
end
class PaymentTerm < ActiveRecord::Base

  validates :name, uniqueness: true

  has_many :accounts
  belongs_to :paymentmode
  belongs_to :user
   validates :paymentmode, :presence => true

end

class Quotation < ActiveRecord::Base
  belongs_to :opportunity
  belongs_to :contact
  belongs_to :account
  belongs_to :user
  belongs_to :quotationtemplate

  validates :account, :presence => true
  validates :contact, :presence => true
validates :opportunity, :presence => true
validates :quotationtemplate, :presence => true

  has_many :quotationline, :dependent => :destroy
    has_many :quotationattachment, :dependent => :destroy

end

class QuotationAttachment < ActiveRecord::Base

    belongs_to :quotation

end

class QuotationLine < ActiveRecord::Base

  belongs_to :quotation
end

class QuotationTemplate < ActiveRecord::Base
  belongs_to :user
  has_many :quotation




end

class Relation < ActiveRecord::Base

  belongs_to :account
  belongs_to :user

  validates :account, presence: true

end

class Role < ActiveRecord::Base

  has_and_belongs_to_many :users
  belongs_to :resource


end


class Setting < ActiveRecord::Base

end
class Tag < ActiveRecord::Base

  validates :name, uniqueness: true

  has_and_belongs_to_many :accounts
  has_and_belongs_to_many :contacts
  belongs_to :user
end

class Task < ActiveRecord::Base


  belongs_to :contact
  belongs_to :account
  belongs_to :user
  belongs_to :eventtype
  has_many :taskattachment, :dependent => :destroy
  has_many :events

  validates :account, :presence => true
  validates :contact, :presence => true
end

class TaskAttachment < ActiveRecord::Base

    belongs_to :task

end

class User < ActiveRecord::Base

  has_many :accounts
  has_many :events
  has_many :tasks
  has_many :emails
end

  class WebmailConnection < ActiveRecord::Base

  end
