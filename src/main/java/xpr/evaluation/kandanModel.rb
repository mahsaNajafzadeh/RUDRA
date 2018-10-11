class Activity < ActiveRecord::Base
  belongs_to :user
  belongs_to :channel
end


class User < ActiveRecord::Base
  has_many :activities
  before_save :ensure_gravatar_hash
  before_save :ensure_authentication_token
  before_create :mark_registration_status_depending_on_app_settings
  after_create :ensure_at_least_one_admin
  after_destroy :ensure_at_least_one_admin
  validates :username, :presence => true, :uniqueness => true
  validate :check_external_avatar

  end

  class Attachment < ActiveRecord::Base
    belongs_to :channel
    belongs_to :user
    end

class Channel < ActiveRecord::Base
  has_many :activities, :dependent => :destroy
  has_many :attachments, :dependent => :destroy
  belongs_to :user
  validates :name, :uniqueness => true
  validates :user, :presence => true
  before_create :ensure_app_max_rooms
  end

  class Setting < ActiveRecord::Base
    before_create :set_default_values
    before_create :ensure_only_one_settings
    before_destroy :ensure_only_one_settings
    before_save :validate_max_rooms, :validate_public_site
   end