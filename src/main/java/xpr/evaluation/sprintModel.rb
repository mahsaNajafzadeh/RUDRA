class Address < ActiveRecord::Base
  end
class AdminUser < ActiveRecord::Base
    has_one :TicketTimer, dependent: :destroy
    has_and_belongs_to_many :projects
    has_and_belongs_to_many :watched_tickets
    has_and_belongs_to_many :teams
    has_many :ticket
 end
class Client < ActiveRecord::Base
      has_many :project, :dependent => :nullify
      has_many :contact, :dependent => :destroy
      validates :name, :presence => true, uniqueness: true
end
class Contact < ActiveRecord::Base

        belongs_to :client
        has_many :projects
         validates :client, :presence => true

 end
 class Milestone < ActiveRecord::Base
          belongs_to :project
          has_many :ticket, :dependent => :nullify
          validates :project, :presence => true
          validates :name, :presence => true
          validates :start_date, :presence => true
          validates :end_date,  :allow_blank => true
 end

class Project < ActiveRecord::Base

  belongs_to :client
  belongs_to :AdminUser
  has_and_belongs_to_many :AdminUser
  has_many :milestone, :dependent => :destroy
  has_many :contacts
  has_many :tickets, dependent: :destroy
  has_many :project_files, dependent: :destroy

  validate :uniqueness_per_account, on: :create
  validates :number, presence: true, numericality: { greater_than_or_equal_to: 0 }
  validates :start_date, :presence => true
  validates :end_date, :allow_blank => true
  validates :adminuser, :client, :presence => true
  validates :hourly_rate, :presence => true, :numericality => { :greater_than_or_equal_to => 0 }

end

class ProjectFile < ActiveRecord::Base

  belongs_to :project
end


class Team < ActiveRecord::Base

  validates :name, :presence => true
  has_and_belongs_to_many :admin_users
  has_many :tickets
end


class Ticket < ActiveRecord::Base
  belongs_to :milestone
  belongs_to :TicketCategory
  belongs_to :TicketPriority
  belongs_to :TicketStatus
  belongs_to :AdminUser
  belongs_to :project
  has_and_belongs_to_many :AdminUser
  has_many :TicketComment, :dependent => :destroy
  has_many :teams
  has_many :tickettimer, dependent: :destroy

  validates :TicketCategory, :TicketPriority, :TicketStatus, :project, :milestone,  :presence => true
  validates :AdminUser, :presence => true
  validates :name,  :uniqueness => true
  validate :project_watchers_membership

   def project_watchers_membership
      (ticket_watchers - project_members).empty?
   end

end


class TicketCategory < ActiveRecord::Base

  has_many :ticket, :dependent => :nullify
  validates :name, :presence => true, uniqueness: true
end


class TicketComment < ActiveRecord::Base
  belongs_to :ticket
  belongs_to :version
  validates :time, :presence => true, :numericality => { :greater_than_or_equal_to => 0 }
end

class TicketPriority < ActiveRecord::Base

  has_many :tickets
  validates :name, presence: true, uniqueness: true

end
class TicketStatus < ActiveRecord::Base

  has_many :tickets

  validates :name, :presence => true, uniqueness: true

end
class TicketTimer < ActiveRecord::Base

  belongs_to :adminuser
  belongs_to :ticket
  has_one :project

end



