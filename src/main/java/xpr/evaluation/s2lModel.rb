class Confidence < ActiveRecord::Base
  validates_uniqueness_of :name,:case_sensitive => false
  belongs_to :account
  end
  class LineItem < ActiveRecord::Base

    belongs_to :opportunity
    belongs_to :product

  end
  class OpportunityRecord < ActiveRecord::Base

    belongs_to :opportunity
  end
  class Target < ActiveRecord::Base

    validates_uniqueness_of :fiscal_year,

    end

    class Account < ActiveRecord::Base
      has_many :users
      has_many :customers
      has_many :confidences
      has_many :opportunities
      has_many :products
      has_many :targets
      end
      class Customer < ActiveRecord::Base

        validates_presence_of :name
        validates_uniqueness_of :name,  :case_sensitive => false

        belongs_to :account
        has_many :opportunities


      end

      class Opportunity < ActiveRecord::Base

        belongs_to :account
        belongs_to :user
        belongs_to :customer
        belongs_to :confidence
        validates_associated :customer, :confidence, :user, :account
        validates_uniqueness_of :name,  :case_sensitive => false


        has_many :opportunity_records
        has_many :line_items, :dependent => :destroy
        has_many :products
        end

        class Product < ActiveRecord::Base
          belongs_to :account
          has_many :line_items
          end

          class User < ActiveRecord::Base

            validates_uniqueness_of :nickname, :case_sensitive => false

            belongs_to :account
            has_many :opportunities
            has_many :targets
            end
