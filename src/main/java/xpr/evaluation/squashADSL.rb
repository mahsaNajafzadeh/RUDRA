class Blame {
}
class Bug {
action BugsController__destroy {
  at__project = oneof(Project)
  at__environment = oneof(at__project.environments)
  at__bug = oneof(at__environment.bugs)
  delete(at__bug.occurrences)
  delete(at__bug.comments)
  delete(at__bug.events)
  delete(at__bug.watches)
  delete(at__bug.notification_thresholds)
  delete(at__bug.device_bugs)
  delete(at__bug)
}
action BugsController__index {
  at__project = oneof(Project)
  at__environment = oneof(at__project.environments)
}
action BugsController__notify_deploy {
  at__project = oneof(Project)
  at__environment = oneof(at__project.environments)
  at__bug = oneof(at__environment.bugs)
}
action BugsController__notify_occurrence {
  at__project = oneof(Project)
  at__environment = oneof(at__project.environments)
  at__bug = oneof(at__environment.bugs)
}
action BugsController__show {
  at__project = oneof(Project)
  at__environment = oneof(at__project.environments)
  at__bug = oneof(at__environment.bugs)
  at__aggregation_dimensions = empty
}
action BugsController__update {
  at__notification_threshold = empty
  at__comment = empty
  at__project = oneof(Project)
  at__environment = oneof(at__project.environments)
  at__bug = oneof(at__environment.bugs)
  if (*) {
    original_bug = tryoneof(at__environment.bugs)
    if (not isempty(original_bug)) {
      at__bug.duplicate_of = original_bug
    } else {
      true
    }
  } else {
    at__bug.duplicate_of = empty
  }
  if (*) {
    if (*) {
      at__comment = create(at__bug.comments)
      at__comment.user = currentuser
      true
    }
    if (*) {
      if (*) {
        delete(subset(currentuser.notification_thresholds))
      } else {
        at__notification_threshold = {
          longanduniqvarname = subset(currentuser.notification_thresholds)
          if (isempty(longanduniqvarname)) {
            create NotificationThreshold
          } else {
            oneof(longanduniqvarname)
          }
        }
      }
    }
  }
}
action BugsController__watch {
  at__project = oneof(Project)
  at__environment = oneof(at__project.environments)
  at__bug = oneof(at__environment.bugs)
  if (not isempty(watch = tryoneof(currentuser.watches))) {
    delete(watch)
  } else {
    watch = {
      longanduniqvarname = subset(currentuser.watches)
      if (isempty(longanduniqvarname)) {
        create Watch
      } else {
        oneof(longanduniqvarname)
      }
    }
  }
}
}
class Comment {
action CommentsController__create {
  at__project = oneof(Project)
  at__environment = oneof(at__project.environments)
  at__bug = oneof(at__environment.bugs)
  at__comment = create(at__bug.comments)
  at__comment.user = currentuser
}
action CommentsController__destroy {
  at__project = oneof(Project)
  at__environment = oneof(at__project.environments)
  at__bug = oneof(at__environment.bugs)
  at__comment = oneof(at__bug.comments)
  delete(at__comment)
}
action CommentsController__index {
  at__project = oneof(Project)
  at__environment = oneof(at__project.environments)
  at__bug = oneof(at__environment.bugs)
  at__comments = subset(at__bug.comments)
  last = if (*) {
    oneof(at__bug.comments)
  }
  if (not isempty(last)) {
    at__comments = subset(at__comments)
  }
}
action CommentsController__update {
  at__project = oneof(Project)
  at__environment = oneof(at__project.environments)
  at__bug = oneof(at__environment.bugs)
  at__comment = oneof(at__bug.comments)
}
}
class Deploy {

}
class DeviceBug {

}
class Email {
action primary_change {
primary=email
}
action EmailsController__create {
  at__project = empty
  if (*) {
    at__project = oneof(Project)
  }
  at__email = create(currentuser.emails)
  at__email.project = at__project
}
action EmailsController__destroy {
  at__project = empty
  if (*) {
    at__project = oneof(Project)
  }
  at__email = oneof(currentuser.emails)
  delete(at__email)
}
action EmailsController__index {
  at__project = empty
  if (*) {
    at__project = oneof(Project)
  }
  at__emails = subset(currentuser.emails)
  if (*) {
    at__emails = subset(at__emails)
  }
}
}
class Environment {
action EnvironmentsController__update {
  at__project = oneof(Project)
  at__environment = oneof(at__project.environments)
}
action EventsController__index {
  at__project = oneof(Project)
  at__environment = oneof(at__project.environments)
  at__bug = oneof(at__environment.bugs)
  at__events = subset(at__bug.events)
  last = if (*) {
    oneof(at__bug.events)
  }
  if (not isempty(last)) {
    at__events = subset(at__events)
  }
}
}
class Event {

}
class Membership {
action Project_MembershipController__destroy {
  at__project = oneof(Project)
  at__membership = oneof(currentuser.memberships)
  delete(at__membership)
}
action Project_MembershipController__edit {
  at__project = oneof(Project)
  at__membership = oneof(currentuser.memberships)
}
action Project_MembershipController__join {
  at__project = oneof(Project)
  at__membership = {
    longanduniqvarname = subset(at__project.memberships)
    if (isempty(longanduniqvarname)) {
      create Membership
    } else {
      oneof(longanduniqvarname)
    }
  }
}
action Project_MembershipController__update {
  at__project = oneof(Project)
  at__membership = oneof(currentuser.memberships)
}
action Project_MembershipsController__create {
  at__project = oneof(Project)
  at__membership = create(at__project.memberships)
}
action Project_MembershipsController__destroy {
  at__project = oneof(Project)
  at__membership = oneof(at__project.memberships)
  if (*) {
    delete(at__membership)
    true
  }
}
action Project_MembershipsController__index {
  at__project = oneof(Project)
}
action Project_MembershipsController__update {
  at__project = oneof(Project)
  at__membership = oneof(at__project.memberships)
}

}
class NotificationThreshold {
action NotificationThresholdsController__create {
  at__project = oneof(Project)
  at__environment = oneof(at__project.environments)
  at__bug = oneof(at__environment.bugs)
  at__notification_threshold = {
    longanduniqvarname = subset(currentuser.notification_thresholds)
    if (isempty(longanduniqvarname)) {
      create NotificationThreshold
    } else {
      oneof(longanduniqvarname)
    }
  }
}
action NotificationThresholdsController__destroy {
  at__project = oneof(Project)
  at__environment = oneof(at__project.environments)
  at__bug = oneof(at__environment.bugs)
  delete(subset(currentuser.notification_thresholds))
}
action NotificationThresholdsController__update {
  at__project = oneof(Project)
  at__environment = oneof(at__project.environments)
  at__bug = oneof(at__environment.bugs)
  at__notification_threshold = {
    longanduniqvarname = subset(currentuser.notification_thresholds)
    if (isempty(longanduniqvarname)) {
      create NotificationThreshold
    } else {
      oneof(longanduniqvarname)
    }
  }
}
}
class ObfuscationMap {

}
class Occurrence {
 action OccurrencesController__aggregate {
   at__project = oneof(Project)
   at__environment = oneof(at__project.environments)
   at__bug = oneof(at__environment.bugs)
 }
 action OccurrencesController__histogram {
   at__project = oneof(Project)
   at__environment = oneof(at__project.environments)
   at__bug = oneof(at__environment.bugs)
 }
 action OccurrencesController__index {
   at__project = oneof(Project)
   at__environment = oneof(at__project.environments)
   at__bug = oneof(at__environment.bugs)
 }
 action OccurrencesController__show {
   at__project = oneof(Project)
   at__environment = oneof(at__project.environments)
   at__bug = oneof(at__environment.bugs)
   at__occurrence = oneof(at__bug.occurrences)
 }
}
class Project {
action ProjectsController__create {
  at__project = create(currentuser.owned_projects)
}
action ProjectsController__destroy {
  at__project = oneof(Project)
  delete(at__project.environments)
  delete(at__project.memberships)
  delete(at__project.emails)
  delete(at__project)
}
action ProjectsController__edit {
  at__project = oneof(Project)
}
action ProjectsController__index {}
action ProjectsController__rekey {
  at__project = oneof(Project)
}
action ProjectsController__show {
  at__project = oneof(Project)
}
action ProjectsController__update {
  at__project = oneof(Project)
}
}
class Slug {
}
class SourceMap {

}
class Symbolication {

}
class User {
action Account_MembershipsController__index {
  at__memberships = subset(currentuser.memberships)
  if (*) {
    at__memberships = subset(at__memberships)
  }
}
action AccountsController__show {}
action AccountsController__update {}
action UsersController__create {
  at__user=create user
}
action UsersController__index {
  at__users = empty
  if (*) {
    at__users = subset(User)
    last = if (*) {
      oneof(User)
    }
    if (not isempty(last)) {
      at__users = subset(at__users)
    }
    empty
  }
}
action UsersController__show {
  at__user = oneof(User)
}

}
class UserEvent {
action SearchController__search {}
action SearchController__suggestions {}
}
class Watch {

}