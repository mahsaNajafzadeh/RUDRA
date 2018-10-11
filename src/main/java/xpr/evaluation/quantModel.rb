class FitbitAccount < ActiveRecord::Base
  validates_presence_of :uid, :oauth_token, :oauth_token_secret
  end

class FoursquareAccount < ActiveRecord::Base
  validates_presence_of :uid, :oauth_token
  end

class JournalEntry < ActiveRecord::Base
    belongs_to :user
 end

class Meal < ActiveRecord::Base
  validates_presence_of :date, :calories
  validates_numericality_of :calories
  validates_numericality_of :carbohydrates, :fat, :protein
  belongs_to :user
  end

class Place < ActiveRecord::Base
  belongs_to :user
  validates :date, presence: true
  validates :lat, presence: true, numericality: true
  validates :lng, presence: true, numericality: true
end

class Sleep < ActiveRecord::Base
  validates_presence_of :start, :end
  validate :ends_after_start
  belongs_to :user
end

class User < ActiveRecord::Base
  validates_numericality_of :height, allow_nil: true
  validates_presence_of :name
  after_save :update_weights_bmi, if: :height_changed?
  has_many :weights
  has_many :places
  has_many :meals
  has_many :sleeps
  has_many :journal_entries
  has_one :withings_account
  has_one :fitbit_account
  has_one :foursquare_account
  end

 class Weight < ActiveRecord::Base
   belongs_to :user
   validates :value, presence: true, numericality: true
   validates :lean_mass, numericality: true, allow_nil: true
   validates :fat_mass, numericality: true, allow_nil: true
   validates :fat_percent, numericality: true, allow_nil: true
   validates :date, presence: true
   before_save :calculate_all_known_values
 end

class WithingsAccount < ActiveRecord::Base
  validates_presence_of :userid, :oauth_token, :oauth_token_secret
end
