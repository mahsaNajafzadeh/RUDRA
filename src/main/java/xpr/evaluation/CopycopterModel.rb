class Blurb < ActiveRecord::Base
  has_many :localizations, :dependent => :destroy
  belongs_to :project
  validates_presence_of :project

  end
  class Locale < ActiveRecord::Base
    belongs_to :project
    has_many :localizations, :dependent => :destroy
    validates_presence_of :project
    validates_uniqueness_of :project_id,
     end

    class Localization < ActiveRecord::Base
      belongs_to :blurb
      belongs_to :locale
      belongs_to :published_version, :class_name => 'Version'
      has_many :versions
      validates_presence_of :blurb, :locale
end
class Project < ActiveRecord::Base
  has_many :blurbs
  has_many :locales, :dependent => :delete_all
  has_many :localizations
  belongs_to :TextCache,  :dependent => :destroy
  validates_uniqueness_of :api_key,
  end

  class Version < ActiveRecord::Base
    belongs_to :localization
    validates_presence_of :localization_id
    end

    class TextCache < ActiveRecord::Base
    end