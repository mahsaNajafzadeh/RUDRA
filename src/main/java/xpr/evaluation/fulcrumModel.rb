class Changeset < ActiveRecord::Base
  belongs_to :project
  belongs_to :story
  validates :project, :presence => true
  validates :story, :presence => true
  end
  class Note < ActiveRecord::Base
    belongs_to :user
    belongs_to :story
    validates :user, :presence => true
      validates :story, :presence => true
    end
  class Project < ActiveRecord::Base
      has_and_belongs_to_many :users
      has_many :stories, :dependent => :destroy
      end

class Story < ActiveRecord::Base
  belongs_to :project
  validates_presence_of :project

  belongs_to :User
  validates :user

  has_many :changesets
  has_many :notes
  end

  class User < ActiveRecord::Base
    has_and_belongs_to_many :projects
    validates :name, :presence => true
    validates :initials, :presence => true
    end
