class Attachment < ActiveRecord::Base
  belongs_to :todo
end

class Context < ActiveRecord::Base

  has_many :todo, :dependent => :delete_all
  has_many :recurringtodo, :dependent => :delete_all
  belongs_to :user
  validates_uniqueness_of :name,
  validates :user, :presence => true
end

  class Dependency < ActiveRecord::Base
    validate :check_circular_dependencies

    def check_circular_dependencies
         successor.is_successor(predecessor)
    end

  end

  class Note < ActiveRecord::Base
    belongs_to :user
    belongs_to :project
    validates :user, :presence => true
    validates :project, :presence => true
  end

  class Preference < ActiveRecord::Base
    belongs_to :user
    belongs_to :context
    end

 class Project < ActiveRecord::Base
      has_many :todo,  dependent: :delete_all
      has_many :note, dependent: :delete_all
      has_many :recurringtodo

      belongs_to :Context
      belongs_to :user
      validates :context, :presence => true
      validates_uniqueness_of :name,
end

 class RecurringTodo < ActiveRecord::Base
   belongs_to :context
   belongs_to :project
   belongs_to :user

   has_many :todos
     validates :project, :presence => true
     validates :user, :presence => true
    validates :project, :presence => true
   validates :context, :presence => true

end


class Tag < ActiveRecord::Base

  has_many :taggings
  has_many :taggable

  validates_presence_of :name
  validates_uniqueness_of :name,
end

class Tagging < ActiveRecord::Base

  belongs_to :tag
  belongs_to :taggable
end

class    Todo < ActiveRecord::Base

  belongs_to :context
  belongs_to :project
  belongs_to :user
  belongs_to :recurringtodo
  validates :context, :presence => true
  validates :project, :presence => true
  validates :user, :presence => true
  validates :recurringtodo, :presence => true

 end

class User < ActiveRecord::Base
  has_many :context, dependent: :delete_all
  has_many :project,  dependent: :delete_all
  has_many :todo, dependent: :delete_all

  has_many :recurring_todos, dependent: :delete_all

  has_many :note, dependent: :delete_all
  has_one :preference, dependent: :destroy
  has_many :attachments
  validates_uniqueness_of :login,

end



