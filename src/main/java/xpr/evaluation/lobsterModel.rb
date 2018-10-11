class Comment < ApplicationRecord
  belongs_to :user
  belongs_to :story
  has_many :vote, :dependent => :delete_all
  has_one :moderation,  :dependent => :destroy
  belongs_to :hat
  has_many :tagging
  validates :user,   presence: true
  validates :story,   presence: true
  end

class Hat < ApplicationRecord
  belongs_to :user

  validates :user,  :presence => true
end

class HatRequest < ApplicationRecord
  belongs_to :user
    belongs_to :comment
        belongs_to :hat
  validates :user, :presence => true
  validates :hat, :presence => true
  validates :comment, :presence => true
end

class HiddenStory < ApplicationRecord
  belongs_to :user
  belongs_to :story

  validates :user, presence: true
end

class Invitation < ApplicationRecord
  belongs_to :user
      validates :user, presence: true
end

class InvitationRequest < ApplicationRecord

 end

class Keystore < ApplicationRecord

end


class Message < ApplicationRecord
  belongs_to :user
  belongs_to :hat

  validates :user, presence: true
end


class Moderation < ApplicationRecord
  belongs_to :User
  belongs_to :comment
  belongs_to :story
  belongs_to :tag
end


class ReadRibbon < ApplicationRecord
  belongs_to :user
  belongs_to :story
end

class ReplyingComment < ApplicationRecord
 belongs_to :comment

end

class SavedStory < ApplicationRecord
  belongs_to :user
  belongs_to :story

  validates :user, :story, presence: true
end


class Story < ApplicationRecord
  belongs_to :user
  has_many :tagging,  :dependent => :destroy
  has_many :suggestedtagging, :dependent => :destroy
  has_many :suggestedtitle, :dependent => :destroy
  has_many :comment,  :dependent => :destroy
  has_many :tag
  has_many :vote
  has_many :voter
  has_many :HiddenStory, :dependent => :destroy
  has_many :SavedStory,  :dependent => :destroy

  validates :user, presence: true
end

class SuggestedTagging < ApplicationRecord
  belongs_to :tag
  belongs_to :story
  belongs_to :user
end
class SuggestedTitle < ApplicationRecord
  belongs_to :story
  belongs_to :user
end
class Tag < ApplicationRecord
  has_many :tagging, :dependent => :delete_all
  has_many :story
  has_many :tagfilter, :dependent => :destroy
  has_many  :user,  :dependent => :delete_all

  validates :tag,  presence: true, uniqueness: true
 end

 class TagFilter < ApplicationRecord
   belongs_to :tag
   belongs_to :user
 end
 class Tagging < ApplicationRecord
   belongs_to :tag
   belongs_to :story
 end
 class User < ApplicationRecord
   has_many :story
   has_many :comment,  :dependent => :restrict_with_exception
   has_many :Message,            :dependent => :restrict_with_exception
   has_many :tagfilter, :dependent => :destroy
   has_many :tag,            :dependent => :delete_all
   has_many :invitation, :dependent => :destroy
   has_many :moderation, :dependent => :restrict_with_exception
   has_many :vote, :dependent => :destroy

   validates :email,   :uniqueness => true


   validates :username,   :uniqueness => true
end

class Vote < ApplicationRecord
  belongs_to :user
  belongs_to :story
  belongs_to :comment
  validates :user,  presence: true
    validates :story,  presence: true,
        validates :comment,  presence: true,
end


