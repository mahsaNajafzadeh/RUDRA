class Post < ActiveRecord::Base
           validates :slug, presence: true, uniqueness: true
           end

         class User < ActiveRecord::Base
           validates_uniqueness_of :email,
         end