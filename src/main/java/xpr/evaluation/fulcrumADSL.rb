class Changeset {
action ChangesetsController__index {
  at__project = oneof(currentuser.projects)
  at__changesets = at__project.changesets
  if (*) {
    at__changesets = subset(at__changesets)
  }
  if (*) {
    at__changesets = subset(at__changesets)
  }
}
}
class Note {
action NotesController__create {
  at__project = oneof(currentuser.projects)
  at__story = oneof(at__project.stories)
  at__note = create(at__story.notes)
  at__note.user = currentuser
}
action NotesController__destroy {
  at__project = oneof(currentuser.projects)
  at__story = oneof(at__project.stories)
  at__note = oneof(at__story.notes)
  delete(at__note)
}
action NotesController__index {
  at__project = oneof(currentuser.projects)
  at__story = oneof(at__project.stories)
  at__notes = at__story.notes
}
action NotesController__show {
  at__project = oneof(currentuser.projects)
  at__story = oneof(at__project.stories)
  at__note = oneof(at__story.notes)
}
}
class Project {
  action ProjectsController__create {
    at__project = create(currentuser.projects)
    at__project.users += currentuser
  }
  action ProjectsController__destroy {
    at__project = oneof(currentuser.projects)
    delete(at__project.stories)
    delete(at__project.changesets)
    delete(at__project)
  }
  action ProjectsController__edit {
    at__project = oneof(currentuser.projects)
    create(at__project.users)
  }
  action ProjectsController__index {
    at__projects = currentuser.projects
  }
  action ProjectsController__new {
    at__project = create Project
  }
  action ProjectsController__show {
    at__project = oneof(currentuser.projects)
    at__story = create(at__project.stories)
  }
  action ProjectsController__update {
    at__project = oneof(currentuser.projects)
  }
}
class Story {
 action StoriesController__accept {
   raise
 }
 action StoriesController__backlog {
   at__project = oneof(currentuser.projects)
   at__stories = subset(at__project.stories)
 }
 action StoriesController__create {
   at__project = oneof(currentuser.projects)
   at__story = create(at__project.stories)
   if (isempty(at__story.requested_by)) {
     at__story.requested_by = currentuser
   }
 }
 action StoriesController__deliver {
   raise
 }
 action StoriesController__destroy {
   at__project = oneof(currentuser.projects)
   at__story = oneof(at__project.stories)
   delete(at__story)
 }
 action StoriesController__done {
   at__project = oneof(currentuser.projects)
   at__stories = subset(at__project.stories)
 }
 action StoriesController__finish {
   raise
 }
 action StoriesController__import {
   at__project = oneof(currentuser.projects)
 }
 action StoriesController__import_upload {
   at__stories = empty
   at__valid_stories = empty
   at__invalid_stories = empty
   at__project = oneof(currentuser.projects)
   if (*) {
     at__stories = at__project.stories
     at__valid_stories = subset(at__stories)
     at__invalid_stories = subset(at__stories)
     empty
   }
 }
 action StoriesController__in_progress {
   at__project = oneof(currentuser.projects)
   at__stories = subset(at__project.stories)
 }
 action StoriesController__index {
   at__project = oneof(currentuser.projects)
   at__stories = at__project.stories
 }
 action StoriesController__reject {
   raise
 }
 action StoriesController__show {
   at__project = oneof(currentuser.projects)
   at__story = oneof(at__project.stories)
 }
 action StoriesController__start {
   raise
 }
 action StoriesController__update {
   at__project = oneof(currentuser.projects)
   at__story = oneof(at__project.stories)
 }
}
class User {
action UsersController__create {
  at__project = oneof(currentuser.projects)
  at__users = at__project.users
  at__user = if (*) {
    create User
  } else {
    oneof(User)
  }
  if (*) {
    if (not at__user in at__project.users) {
      at__project.users += at__user
      empty
    }
    empty
  }
}
action UsersController__destroy {
  at__project = oneof(currentuser.projects)
  at__user = oneof(at__project.users)
  at__project.users -= at__user
}
action UsersController__index {
  at__project = oneof(currentuser.projects)
  at__users = at__project.users
  at__user = create User
}
action ConfirmationsController__create {
  create User
}
action ConfirmationsController__new {
  create User
}
action ConfirmationsController__show {}
}