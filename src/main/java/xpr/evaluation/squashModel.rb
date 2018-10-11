class Blame < ActiveRecord::Base

end
class Bug < ActiveRecord::Base
  belongs_to :environment
  belongs_to :User
  belongs_to :deploy

  has_many :occurrence, dependent: :delete_all
  has_many :comment, dependent: :delete_all
  has_many :event, dependent: :delete_all
  has_many :watch, dependent: :delete_all
  has_many :notification_threshold, dependent: :delete_all
  has_many :device_bug, dependent: :delete_all

  validates :environment,      presence: true

  validate :open_bugs_cannot_be_deployed
  validate  :assigned_user_must_be_project_member
  validate        :cannot_be_duplicate_of_duplicate
  validate :cannot_set_duplicate_twice
  validate       :cannot_be_duplicate_of_foreign_bug

   def open_bugs_cannot_be_deployed
      if fix_deployed && !fixed
   end

  def assigned_user_must_be_project_member
    if  user && user.role(environment.project).nil?
  end

 def cannot_be_duplicate_of_duplicate

  end

 def cannot_set_duplicate_twice

  end

   def cannot_be_duplicate_of_foreign_bug

    end

end
 class Comment < ActiveRecord::Base
   belongs_to :user
   belongs_to :bug

   validates :bug,  presence: true
   validate :user_must_have_permission_to_comment

   def user_must_have_permission_to_comment

     end
 end


class Deploy < ActiveRecord::Base
  belongs_to :environment
  has_one :project
  has_many :bug, dependent: :nullify

  validates :environment,     presence: true

end

class DeviceBug < ActiveRecord::Base

      belongs_to :bug

      validates :bug,   presence: true
end
class Email < ActiveRecord::Base
      belongs_to :user
      belongs_to :project
      validates :email,   presence:   true, uniqueness: true
      validates :user,   presence: true
      validate :cant_redirect_your_own_email
      validate :project_emails_cant_be_primary
      validate :cannot_locally_redirect_gobally_redirected_email
      validate :user_must_be_member_of_project

 def one_primary_email

  end


    def user_must_be_member_of_project

     end

  def project_emails_cant_be_primary

  end

  def cannot_locally_redirect_gobally_redirected_email

  end



end
class Environment < ActiveRecord::Base
  belongs_to :project
  has_one :project
  has_many :deploy, dependent: :delete_all
  has_many :bug, dependent: :delete_all
  has_many :sourcemap,  dependent: :delete_all

  validates :project,  presence: true
  validates :name, presence:   true,   uniqueness: true

end

class Event < ActiveRecord::Base
  belongs_to :bug
  belongs_to :user
  has_many :user_event, dependent: :delete_all
  validates :bug,  presence: true

end
class Membership < ActiveRecord::Base

  belongs_to :user
  belongs_to :project

  validates :user,    presence: true
  validates :project,   presence: true

end
class NotificationThreshold < ActiveRecord::Base
    belongs_to :user
    belongs_to :bug

    validates :user, presence: true
    validates :bug,   presence: true

end
class ObfuscationMap < ActiveRecord::Base
  belongs_to :deploy

  validates :deploy,  presence: true
end

class Occurrence < ActiveRecord::Base
  belongs_to :bug
  belongs_to :symbolication
  belongs_to :Occurrence

  validates :bug, presence: true


end
class Project < ActiveRecord::Base

  belongs_to :User
  belongs_to :Environment

  has_many :environment, dependent: :delete_all
  has_many :membership, dependent: :delete_all
  has_many :email, dependent: :delete_all

  validates :User,  presence: true

 validates :Environment,  presence: true

  end

class Slug < ActiveRecord::Base


  validates :slug,   uniqueness: true

  validate :one_active_slug_per_object

  def one_active_slug_per_object

end

 end

 class SourceMap < ActiveRecord::Base
   belongs_to :environment

   validates :environment,  presence: true
end

class Symbolication < ActiveRecord::Base

  has_many :occurrence, dependent: :restrict_with_exception

  validates :uuid,  presence:   true,  uniqueness: true


end

class User < ActiveRecord::Base

  has_many :bug, dependent: :nullify
  has_many :comment, dependent: :nullify
  has_many :event, dependent: :nullify
  has_many :membership, dependent: :delete_all
  has_many :member_project
  has_many :project, dependent: :restrict_with_exception
  has_many :watch, dependent: :delete_all
  has_many :userevent, dependent: :delete_all
  has_many :email, dependent: :delete_all
  has_many :notification_threshold, dependent: :delete_all


  validates :username,  presence:   true,   uniqueness: true

end
class UserEvent < ActiveRecord::Base
  belongs_to :user
  belongs_to :event

  validates :user, presence: true
  validates :event,  presence: true
end

class Watch < ActiveRecord::Base
  belongs_to :user
  belongs_to :bug

  validates :user,  presence: true
  validates :bug, presence: true
  validate :user_cannot_watch_foreign_bug

end
