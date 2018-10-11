class Activity {
action ActivitiesController__create {
  at__activity = create((oneof(Channel)).activities)
  if (*) {
    at__activity.user = currentuser
  }
}
action ActivitiesController__index {}
action ActivitiesController__show {
  at__activity = oneof(Activity)
}
}
class Attachment {
action AttachmentsController__create {
  at__channel = oneof(Channel)
  at__attachment = create Attachment
  at__attachment.user = currentuser
  at__attachment.channel = at__channel
}
action AttachmentsController__destroy {
  at__attachment = oneof(Attachment)
  delete(at__attachment)
}
action AttachmentsController__index {
  at__channel = oneof(Channel)
  at__attachments = at__channel.attachments
}
}
class Channel {
action ChannelsController__index {
  at__channels = subset(Channel)
  assert ((inusergroup(admin) and at__channels in Channel) or (inusergroup(nonadmin) and at__channels in Channel))
}
action ChannelsController__show {
  at__channel = tryoneof(Channel)
  assert ((inusergroup(admin) and at__channel in Channel) or (inusergroup(nonadmin) and at__channel in Channel))
}
action ChannelsController__update {
  at__channel = oneof(Channel)
  assert ((inusergroup(admin) and at__channel in Channel) or (inusergroup(nonadmin) and at__channel in Channel))
}
action ChannelsController__create {
  at__channel = create Channel
  assert ((inusergroup(admin) and at__channel in Channel) or (inusergroup(nonadmin) and at__channel in Channel))
  at__channel.user = currentuser
}
action ChannelsController__destroy {
  at__channel = oneof(Channel)
  assert ((inusergroup(admin) and at__channel in Channel) or (inusergroup(nonadmin) and at__channel in Channel))
  delete(oneof(Channel).activities)
  delete(oneof(Channel).attachments)
  delete(oneof(Channel))
}
}
class Setting {
}
class User {
action UsersController__index {
  at__users = subset(User)
  assert ((inusergroup(admin) and at__users in User) or (inusergroup(nonadmin) and at__users in union(currentuser, User)))
}
action UsersController__show {
  at__user = empty
  if (*) {
    at__user = currentuser
  }
  assert ((inusergroup(admin) and at__user in User) or (inusergroup(nonadmin) and at__user in union(currentuser, User)))
}
action Admin_AdminController__toggle_admin {
  assert inusergroup(admin)
}
action Admin_AdminController__update {
  assert inusergroup(admin)
  if (isempty(Setting)) {
    create Setting
  } else {
    oneof(Setting)
  }
}
action Admin_AdminController__update_user {
  assert inusergroup(admin)
}
}


