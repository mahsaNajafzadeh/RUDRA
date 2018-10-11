class Comment {
action CommentsController__create {
  at__user = currentuser
  assert not isempty(at__user)
  story = tryoneof(Story)
  if (not isempty(story)) {
    comment = create(story.comments)
    comment.user = at__user
    if (not isempty(subset(at__user.hats))) {
      comment.hat = oneof(Hat)
    }
    if (*) {
      if (not isempty(pc = tryoneof(Comment))) {
        comment.parent_comment = pc
        not isempty(pc = tryoneof(Comment))
        empty
      }
    } else {
      not isempty(pc = tryoneof(Comment))
      empty
    }
  }
}
action CommentsController__delete {
  at__user = currentuser
  comment = {
    comment = tryoneof(Comment)
    comment
  }
  if (*) {
    if (not equal(at__user, comment.user)) {
      m = create Moderation
      m.comment = comment
      m.moderator = at__user
      true
    }
    empty
  }
  delete(at_comment)
}
action CommentsController__downvote {
  at__user = currentuser
  assert not isempty(at__user)
  comment = {
    comment = tryoneof(Comment)
    comment
  }
}
action CommentsController__edit {
  at__user = currentuser
  comment = {
    comment = tryoneof(Comment)
    comment
  }
}
action CommentsController__index {
  at__votes = empty
  at__user = currentuser
  if (*) {
    at__user = tryoneof(User)
  }
  at__heading = at__title = empty
  at__cur_url = empty
  at__page = empty
  if (*) {
    at__page = empty
  }
  at__comments = subset(Comment)
  if (not isempty(at__user)) {
    at__comments = subset(at__comments)
    at__votes = empty
    foreach c: at__comments {
      if (*) {
        c
      }
    }
  }
}
action CommentsController__redirect_from_short_id {
  at__user = currentuser
  comment = {
    comment = tryoneof(Comment)
    comment
  }
}
action CommentsController__reply {
  at__user = currentuser
  parent_comment = {
    comment = tryoneof(Comment)
    comment
  }
  if (not isempty(parent_comment)) {
    comment = create Comment
    comment.story = parent_comment.story
    comment.parent_comment = parent_comment
    empty
  }
}
action CommentsController__show {
  at__user = currentuser
  comment = {
    comment = tryoneof(Comment)
    comment
  }
}
action CommentsController__show_short_id {
  at__user = currentuser
  comment = {
    comment = tryoneof(Comment)
    comment
  }
}
action CommentsController__threads {
  at__showing_user = empty
  at__title = empty
  at__heading = empty
  at__cur_url = empty
  at__threads = empty
  at__votes = empty
  at__user = currentuser
  if (*) {
    at__showing_user = oneof(User)
    at__heading = at__title = empty
    at__cur_url = empty
    thread_ids = {
      thread_ids = subset(at__showing_user.comments)
      if (*) {
        thread_ids = union(thread_ids, subset(Comment))
        thread_ids = thread_ids
      }
      thread_ids
    }
    comments = subset(Comment)
    comments_by_thread_id = comments
    at__threads = comments_by_thread_id
    if (equal(at__showing_user, at__user)) {
      at__votes = empty
      foreach c: comments {
        if (*) {
          c
        }
      }
    }
  } else {
    if (not isempty(at__user)) {
      at__showing_user = at__user
      at__heading = at__title = empty
      at__cur_url = empty
      thread_ids = {
        thread_ids = subset(at__showing_user.comments)
        if (*) {
          thread_ids = union(thread_ids, subset(Comment))
          thread_ids = thread_ids
        }
        thread_ids
      }
      comments = subset(Comment)
      comments_by_thread_id = comments
      at__threads = comments_by_thread_id
      if (equal(at__showing_user, at__user)) {
        at__votes = empty
        foreach c: comments {
          if (*) {
            c
          }
        }
      }
    }
  }
}
action CommentsController__undelete {
  at__user = currentuser
  comment = {
    comment = tryoneof(Comment)
    comment
  }
  if (*) {
    if (inusergroup(at__user, moderator)) {
      if (not equal(at__user, comment.user)) {
        m = create Moderation
        m.comment = comment
        m.moderator = at__user
        true
      }
    }
    empty
  }
}
action CommentsController__unvote {
  at__user = currentuser
  assert not isempty(at__user)
  comment = {
    comment = tryoneof(Comment)
    comment
  }
}
action CommentsController__update {
  at__user = currentuser
  comment = {
    comment = tryoneof(Comment)
    comment
  }
  if (*) {
    comment.hat = empty
    if (not isempty(subset(at__user.hats))) {
      comment.hat = oneof(Hat)
    }
    empty
  }
}
action CommentsController__upvote {
  at__user = currentuser
  assert not isempty(at__user)
  comment = {
    comment = tryoneof(Comment)
    comment
  }
}
}
class Hat {
action FiltersController__index {
  at___tags_filtered = empty
  at__filtered_tags = empty
  at__user = currentuser
  at__cur_url = empty
  at__title = empty
  at__tags = empty
  if (not isempty(at__user)) {
    at__filtered_tags = at__user.tag_filters.tag
  } else {
    at__filtered_tags = at___tags_filtered = if (isempty(at___tags_filtered)) {
      subset(Tag)
    } else {
      at___tags_filtered
    }
  }
}
action FiltersController__update {
  at__user = currentuser
  new_tags = if (*) {
    subset(Tag)
  }
  if (not isempty(at__user)) {
    user__tag_filters__origin = at__user
    user__tag_filters__target = new_tags
    delete(user__tag_filters__origin.tag_filters)
    foreach user__tag_filters__iterator: user__tag_filters__target {
      user__tag_filters__join_object = create TagFilter
      user__tag_filters__origin.tag_filters += user__tag_filters__join_object
      user__tag_filters__join_object.tag += user__tag_filters__iterator
    }
  }
}
action HatsController__approve_request {
  at__user = currentuser
  assert not isempty(at__user)
  assert not isempty(at__user)
  if (not isempty(at__user)) {
    assert inusergroup(at__user, moderator)
    true
  }
  at__hat_request = oneof(HatRequest)
  h = create Hat
  h.user = at__hat_request.user
  h.granted_by_user = at__user
  m = create Message
  m.author = at__user
  m.recipient = at__hat_request.user
  delete(at__hat_request)
}
action HatsController__build_request {
  at__user = currentuser
  assert not isempty(at__user)
  at__title = empty
  at__hat_request = create HatRequest
}
action HatsController__create_request {
  at__user = currentuser
  assert not isempty(at__user)
  at__hat_request = create HatRequest
  at__hat_request.user = at__user
}
action HatsController__index {
  at__user = currentuser
  at__title = empty
  at__hat_groups = empty
}
action HatsController__reject_request {
  at__user = currentuser
  assert not isempty(at__user)
  assert not isempty(at__user)
  if (not isempty(at__user)) {
    assert inusergroup(at__user, moderator)
    true
  }
  at__hat_request = oneof(HatRequest)
  m = create Message
  m.author = at__user
  m.recipient = at__hat_request.user
  delete(at__hat_request)
}
action HatsController__requests_index {
  at__user = currentuser
  assert not isempty(at__user)
  assert not isempty(at__user)
  if (not isempty(at__user)) {
    assert inusergroup(at__user, moderator)
    true
  }
  at__title = empty
  at__hat_requests = HatRequest
}
}
class HatRequest {
action HomeController__about {
  at__title = empty
  at__user = currentuser
  if (*) {
    at__title = empty
    empty
  }
}
action HomeController__chat {
  at__title = empty
  at__user = currentuser
  if (*) {
    at__title = empty
    empty
  }
}
action HomeController__hidden {
  at__user = currentuser
  at__stories = empty
  at__show_more = empty
  at__heading = at__title = empty
  at__cur_url = empty
}
action HomeController__index {
  at__user = currentuser
  if (*) {
    at__user = tryoneof(User)
  }
  at__stories = empty
  at__show_more = empty
  at__heading = at__title = empty
  at__cur_url = empty
}
action HomeController__newest {
  at__user = currentuser
  if (*) {
    at__user = tryoneof(User)
  }
  at__stories = empty
  at__show_more = empty
  at__heading = at__title = empty
  at__cur_url = empty
  at__rss_link = empty
}
action HomeController__newest_by_user {
  at__user = currentuser
  at__stories = empty
  at__show_more = empty
  at__heading = at__title = empty
  at__cur_url = empty
  at__for_user = empty
}
action HomeController__privacy {
  at__title = empty
  at__user = currentuser
  if (*) {
    at__title = empty
    empty
  }
}
action HomeController__recent {
  at__user = currentuser
  at__stories = empty
  at__show_more = empty
  at__heading = at__title = empty
  at__cur_url = empty
  at__rss_link = empty
}
action HomeController__tagged {
  at__user = currentuser
  at__tag = oneof(Tag)
  at__stories = empty
  at__show_more = empty
  at__heading = at__title = empty
  at__cur_url = empty
  at__rss_link = empty
}
action HomeController__top {
  at__user = currentuser
}
action HomeController__upvoted {
  at__user = currentuser
  assert not isempty(at__user)
  at__stories = empty
  at__show_more = empty
  at__heading = at__title = empty
  at__cur_url = empty
  at__rss_link = empty
}

}
class HiddenStory {

}
class Invitation {
action InvitationsController__build {
  at__user = currentuser
  at__invitation_request = create InvitationRequest
}
action InvitationsController__confirm_email {
  at__user = currentuser
  assert not isempty(tryoneof(InvitationRequest))
}
action InvitationsController__create {
  at__user = currentuser
  assert not isempty(at__user)
  i = create Invitation
  i.user = at__user
}
action InvitationsController__create_by_request {
  at__user = currentuser
  at__invitation_request = create InvitationRequest
}
action InvitationsController__delete_request {
  at__user = currentuser
  assert not isempty(at__user)
  assert inusergroup(at__user, moderator)
  ir = tryoneof(InvitationRequest)
  assert not isempty(ir)
  delete(ir)
}
action InvitationsController__index {
  at__user = currentuser
  assert not isempty(at__user)
  at__invitation_requests = subset(InvitationRequest)
}
action InvitationsController__send_for_request {
  at__user = currentuser
  assert not isempty(at__user)
  ir = tryoneof(InvitationRequest)
  assert not isempty(ir)
  i = create Invitation
  i.user = at__user
  delete(ir)
}
}
class InvitationRequest {
}
class Keystore {
action LoginController__forgot_password {
  at__user = currentuser
  at__title = empty
}
action LoginController__index {
  at__user = currentuser
  at__title = empty
}
action LoginController__login {
  at__user = currentuser
}
action LoginController__logout {
  at__user = currentuser
}
action LoginController__reset_password {
  raise
}
action LoginController__set_new_password {
  at__user = currentuser
  at__title = empty
}
}
class Message {
action MessagesController__batch_delete {
  at__user = currentuser
  assert not isempty(at__user)
}
action MessagesController__create {
  at__user = currentuser
  assert not isempty(at__user)
  at__cur_url = empty
  at__title = empty
  at__new_message = create Message
  at__new_message.author = at__user
  at__direction = empty
  at__messages = subset(at__user.received_messages)
}
action MessagesController__destroy {
  at__user = currentuser
  assert not isempty(at__user)
  assert not isempty(at__message = tryoneof(Message))
  assert equal(at__message.author, at__user)
}
action MessagesController__index {
  at__recipient_username = empty
  at__user = currentuser
  assert not isempty(at__user)
  at__cur_url = empty
  at__title = empty
  at__new_message = create Message
  at__direction = empty
  at__messages = subset(at__user.received_messages)
  if (*) {
    at__new_message.recipient = empty
    if (not isempty(u = tryoneof(User))) {
      at__new_message.recipient = u
      at__recipient_username = empty
    }
  }
}
action MessagesController__keep_as_new {
  at__user = currentuser
  assert not isempty(at__user)
  assert not isempty(at__message = tryoneof(Message))
  assert equal(at__message.author, at__user)
}
action MessagesController__sent {
  at__user = currentuser
  assert not isempty(at__user)
  at__cur_url = empty
  at__title = empty
  at__direction = empty
  at__messages = subset(at__user.sent_messages)
  at__new_message = create Message
}
action MessagesController__show {
  at__new_message = empty
  at__recipient_username = empty
  at__user = currentuser
  assert not isempty(at__user)
  assert not isempty(at__message = tryoneof(Message))
  assert equal(at__message.author, at__user)
  at__cur_url = empty
  at__title = empty
  if (not isempty(at__message.author)) {
    at__new_message = create Message
    at__new_message.recipient = empty
    if (not isempty(u = tryoneof(User))) {
      at__new_message.recipient = u
      at__recipient_username = empty
    }
    empty
  }
}
}
class Moderation {
action ModerationsController__index {
  at__user = currentuser
  at__title = empty
  at__page = empty
  at__pages = empty
  if (*) {
    at__page = empty
  } else {
    if (*) {
      at__page = empty
    }
  }
  at__moderations = subset(Moderation)
}
action SettingsController__index {
  at__user = currentuser
  assert not isempty(at__user)
  at__title = empty
  at__edit_user = at__user
}
action SettingsController__pushover {
  at__user = currentuser
  assert not isempty(at__user)
}
action SettingsController__pushover_callback {
  at__user = currentuser
  assert not isempty(at__user)
}
action SettingsController__update {
  at__user = currentuser
  assert not isempty(at__user)
  at__edit_user = at__user
  if (*) {
    at__user = at__edit_user
  }
}
action SignupController__index {
  at__title = empty
  at__user = currentuser
  if (isempty(at__user)) {
    at__title = empty
  }
}
action SignupController__invite {
  at__user = currentuser
  assert not isempty(at__user)
  at__title = empty
}
action SignupController__invited {
  at__title = empty
  at__new_user = empty
  at__invitation = empty
  at__user = currentuser
  if (isempty(at__user)) {
    if (not isempty(at__invitation = tryoneof(Invitation))) {
      at__title = empty
      at__new_user = create User
      empty
    }
  }
}
action SignupController__signup {
  at__title = empty
  at__new_user = empty
  at__user = currentuser
  at__invitation = tryoneof(Invitation)
  if (not isempty(at__invitation)) {
    at__title = empty
    at__new_user = create User
    at__new_user.invited_by_user = at__invitation.user
    if (*) {
      delete(at__invitation)
      empty
    }
  }
}
}
class Story {
action StoriesController__create {
  at__user = currentuser
  assert not isempty(at__user)
  at__title = empty
  at__cur_url = empty
  at__story = create Story
  at__story.user = at__user
}
action StoriesController__destroy {
  at__user = currentuser
  assert not isempty(at__user)
  at__story = tryoneof(Story)
  assert not isempty(at__story)
  delete(at_story)
}
action StoriesController__downvote {
  at__user = currentuser
  assert not isempty(at__user)
  isempty(story = {
    story = tryoneof(Story)
    story
  })
}
action StoriesController__edit {
  at__title = empty
  at__user = currentuser
  assert not isempty(at__user)
  at__story = tryoneof(Story)
  assert not isempty(at__story)
  if (*) {
    at__title = empty
    empty
  }
}
action StoriesController__fetch_url_attributes {
  at__user = currentuser
  assert not isempty(at__user)
  create Story
}
action StoriesController__hide {
  at__user = currentuser
  assert not isempty(at__user)
  isempty(story = {
    story = tryoneof(Story)
    story
  })
}
action StoriesController__new {
  at__user = currentuser
  assert not isempty(at__user)
  at__title = empty
  at__cur_url = empty
  at__story = create Story
  if (*) {
    not isempty(s = if (not isempty(s = tryoneof(Story))) {
      s
    })
    empty
  }
}
action StoriesController__preview {
  at__user = currentuser
  assert not isempty(at__user)
  at__story = create Story
  at__story.user = at__user
  create Vote
}
action StoriesController__show {
  at__title = empty
  at__comments = empty
  at__user = currentuser
  at__story = oneof(Story)
  if (isempty(at__story.merged_into_story)) {
    at__title = empty
    at__comments = subset(Comment)
    empty
  }
}
action StoriesController__submit_suggestions {
  at__user = currentuser
  at__story = {
    story = tryoneof(Story)
    story
  }
  assert not isempty(at__story)
  if (*) {
    if (*) {
      if (*) {
        st = subset(at__story.suggested_taggings)
        foreach tagging: st {
          if (*) {
            delete(tagging)
          }
        }
        true
      }
      empty
    }
  }
}
action StoriesController__suggest {
  at__user = currentuser
  assert not isempty(at__user)
  at__story = {
    story = tryoneof(Story)
    story
  }
  assert not isempty(at__story)
}
action StoriesController__undelete {
  at__user = currentuser
  at__story = tryoneof(Story)
  assert not isempty(at__story)
}
action StoriesController__unhide {
  at__user = currentuser
  assert not isempty(at__user)
  if (not isempty(story = {
    story = tryoneof(Story)
    story
  })) {
    delete(subset(HiddenStory))
    empty
  }
}
action StoriesController__unvote {
  at__user = currentuser
  assert not isempty(at__user)
  isempty(story = {
    story = tryoneof(Story)
    story
  })
}
action StoriesController__update {
  at__user = currentuser
  at__story = tryoneof(Story)
  assert not isempty(at__story)
}
action StoriesController__upvote {
  at__user = currentuser
  assert not isempty(at__user)
  isempty(story = {
    story = tryoneof(Story)
    story
  })
}
}
class SuggestedTagging {

}
class SuggestedTitle {

}
class Tag {
action TagsController__index {
  at__user = currentuser
  at__cur_url = empty
  at__title = empty
  at__tags = empty
}
}
class TagFilter {

}
class Tagging {

}
 class User {
 action UsersController__ban {
   at__user = currentuser
   assert not isempty(at__user)
   if (not isempty(at__user)) {
     assert inusergroup(at__user, moderator)
     true
   }
   buser = tryoneof(User)
   if (not isempty(buser)) {
     if (*) {
       buser.banned_by_user = at__user
       delete(buser)
       m = create Moderation
       m.moderator = at__user
       m.user = buser
       empty
     }
   }
 }
 action UsersController__disable_invitation {
   at__user = currentuser
   assert not isempty(at__user)
   if (not isempty(at__user)) {
     assert inusergroup(at__user, moderator)
     true
   }
   target = tryoneof(User)
   if (not isempty(target)) {
     target.disabled_invite_by_user = at__user
     msg = create Message
     msg.author = at__user
     msg.recipient = target
     m = create Moderation
     m.moderator = at__user
     m.user = target
     empty
   }
 }
 action UsersController__enable_invitation {
   at__user = currentuser
   assert not isempty(at__user)
   if (not isempty(at__user)) {
     assert inusergroup(at__user, moderator)
     true
   }
   target = tryoneof(User)
   if (not isempty(target)) {
     target.disabled_invite_by_user = empty
     m = create Moderation
     m.moderator = at__user
     m.user = target
     empty
   }
 }
 action UsersController__show {
   at__user = currentuser
   at__showing_user = oneof(User)
   at__title = empty
 }
 action UsersController__tree {
   at__users_by_parent = empty
   at__newest = empty
   at__users = empty
   at__user_count = empty
   at__user = currentuser
   at__title = empty
   if (*) {
     at__users = User
     at__user_count = empty
     empty
   } else {
     if (*) {
       at__users = subset(User)
       at__user_count = empty
       at__title = empty
       empty
     } else {
       users = User
       at__user_count = empty
       at__users_by_parent = users
       at__newest = subset(User)
     }
   }
 }
 action UsersController__unban {
   at__user = currentuser
   assert not isempty(at__user)
   if (not isempty(at__user)) {
     assert inusergroup(at__user, moderator)
     true
   }
   buser = tryoneof(User)
   if (not isempty(buser)) {
     buser.banned_by_user = empty
     m = create Moderation
     m.moderator = at__user
     m.user = buser
     empty
   }
 }
 action SettingsController__delete_account {
   at__user = currentuser
   assert not isempty(at__user)
     delete(at__user)
     empty
 }
}
class Vote {

}
class ReadRibbon  {
}

class ReplyingComment {
}

class SavedStory {
}
