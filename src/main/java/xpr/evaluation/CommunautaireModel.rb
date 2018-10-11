class Article < ActiveRecord::Base

  belongs_to :category, :foreign_key => "category"
  belongs_to :user, 	:foreign_key => "author"
  validates :user,  	:presence => true
  validates :category,  :presence => true

end
class Category < ActiveRecord::Base
  has_many :articles, 	:foreign_key => "category"
  has_many :topics, 	:foreign_key => 'category'

end

class Post < ActiveRecord::Base

  belongs_to :user, 	:foreign_key => "author"
  belongs_to :topic, 	:foreign_key => "topic"
  validates :content,  	:presence => true
  validates :user,  	:presence => true
  validates :topic,  	:presence => true

end

class Topic < ActiveRecord::Base

  belongs_to :user,     :foreign_key => "author"
  belongs_to :category, :foreign_key => "category"
  has_many :posts,		:foreign_key => "topic"

  validates :title,  	    :presence => true
  validates :category,    :presence => true
  validates :user,  	  :presence => true
end

class User < ActiveRecord::Base
  has_many :articles, :foreign_key => "author"
  has_many :topics,   :foreign_key => "author"
  has_many :posts,    :foreign_key => "author"
end