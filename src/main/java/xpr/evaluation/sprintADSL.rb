class Address {
}
class AdminUser {
action AdminUsersController__activate {
  assert inusergroup(admin)
  at__user = if (*) {
    oneof(AdminUser)
  }
}
action AdminUsersController__batch_action {
  assert (inusergroup(admin) or inusergroup(employee))
}
action AdminUsersController__change_password {
  assert (inusergroup(admin) or inusergroup(employee))
  at__user = if (*) {
    currentuser
  } else {
    oneof(AdminUser)
  }
}
action AdminUsersController__create {
  assert inusergroup(admin)
  at__admin_user = create AdminUser
}
action AdminUsersController__deactivate {
  assert inusergroup(admin)
  at__user = if (*) {
    oneof(AdminUser)
  }
}
action AdminUsersController__destroy {
  assert inusergroup(admin)
  at__admin_users = subset(AdminUser)
  delete(at__admin_users)
}
action AdminUsersController__edit {
  assert (inusergroup(admin) or inusergroup(employee))
  at__admin_user = oneof(AdminUser)
}
action AdminUsersController__index {
  assert inusergroup(admin)
  at__admin_users = subset(AdminUser)
}
action AdminUsersController__new {
  assert inusergroup(admin)
}
action AdminUsersController__process_password_change {
  assert (inusergroup(admin) or inusergroup(employee))
  at__user = if (*) {
    oneof(AdminUser)
  }
}
action AdminUsersController__profile {
  assert (inusergroup(admin) or inusergroup(employee))
}
action AdminUsersController__show {
  assert inusergroup(admin)
  at__admin_user = oneof(AdminUser)
}
action AdminUsersController__update {
  assert (inusergroup(admin) or inusergroup(employee))
  at__admin_user = oneof(AdminUser)
}
action CalendarController__events {}
action CalendarController__set_filters {}
action ClientsController__batch_action {
  assert (inusergroup(admin) or inusergroup(employee))
}
}
class Client {
action ClientsController__create {
  assert inusergroup(admin)
  at__client = create Client
}
action ClientsController__destroy {
  assert inusergroup(admin)
  at__clients = subset(Client)
  delete(at__clients)
}
action ClientsController__edit {
  assert inusergroup(admin)
  at__client = oneof(Client)
}
action ClientsController__index {
  assert inusergroup(admin)
  at__clients = subset(Client)
}
action ClientsController__new {
  assert inusergroup(admin)
}
action ClientsController__show {
  assert inusergroup(admin)
  at__client = oneof(Client)
}
action ClientsController__update {
  assert inusergroup(admin)
  at__client = oneof(Client)
}
action CommentsController__batch_action {}
action CommentsController__create {}
action CommentsController__index {}
action CommentsController__show {}
}
class Contact {
 action ContactsController__batch_action {
   assert (inusergroup(admin) or inusergroup(employee))
 }
 action ContactsController__create {
   assert inusergroup(admin)
   at__contact = create Contact
 }
 action ContactsController__destroy {
   assert inusergroup(admin)
   at__contacts = subset(Contact)
   delete(at__contacts)
 }
 action ContactsController__edit {
   assert inusergroup(admin)
   at__contact = oneof(Contact)
 }
 action ContactsController__index {
   assert inusergroup(admin)
   at__contacts = subset(Contact)
 }
 action ContactsController__new {
   assert inusergroup(admin)
 }
 action ContactsController__show {
   assert inusergroup(admin)
   at__contact = oneof(Contact)
 }
 action ContactsController__update {
   assert inusergroup(admin)
   at__contact = oneof(Contact)
 }
 action EmployeeTimesheetController__view {}
 action HoursWorkedReportController__view {}
}
class Milestone {
 action MilestonesController__batch_action {
   assert inusergroup(admin)
 }
 action MilestonesController__complete {
   assert inusergroup(admin)
   at__milestone = if (*) {
     oneof(Milestone)
   }
 }
 action MilestonesController__create {
   assert inusergroup(admin)
   at__milestone = create Milestone
 }
 action MilestonesController__destroy {
   assert inusergroup(admin)
   at__milestones = subset(Milestone)
   delete(at__milestones)
 }
 action MilestonesController__edit {
   assert inusergroup(admin)
   at__milestone = oneof(Milestone)
 }
 action MilestonesController__index {
   raise
   at__milestones = subset(Milestone)
 }
 action MilestonesController__new {
   assert inusergroup(admin)
 }
 action MilestonesController__revive {
   assert inusergroup(admin)
   at__milestone = if (*) {
     oneof(Milestone)
   }
 }
 action MilestonesController__roadmap {
   assert inusergroup(admin)
   at__milestone = if (*) {
     oneof(Milestone)
   }
 }
 action MilestonesController__show {
   raise
   at__milestone = oneof(Milestone)
 }
 action MilestonesController__update {
   assert inusergroup(admin)
   at__milestone = oneof(Milestone)
 }
}
class Project {
 action ProjectsController__archive {
   assert inusergroup(admin)
   at__project = oneof(Project)
 }
 action ProjectsController__batch_action {
   assert inusergroup(admin)
 }
 action ProjectsController__create {
   assert inusergroup(admin)
   at__project = create Project
 }
 action ProjectsController__destroy {
   assert inusergroup(admin)
   at__projects = subset(Project)
   delete(at__projects)
 }
 action ProjectsController__edit {
   assert inusergroup(admin)
   at__project = oneof(Project)
 }
 action ProjectsController__edit_whiteboard {
   assert inusergroup(admin)
   at__project = oneof(Project)
 }
 action ProjectsController__index {
   assert inusergroup(admin)
   at__projects = subset(Project)
 }
 action ProjectsController__new {
   assert inusergroup(admin)
 }
 action ProjectsController__roadmap {
   assert inusergroup(admin)
   at__project = oneof(Project)
 }
 action ProjectsController__save_whiteboard {
   assert inusergroup(admin)
   at__project = oneof(Project)
 }
 action ProjectsController__show {
   assert inusergroup(admin)
   at__project = oneof(Project)
 }
 action ProjectsController__switch {
   assert inusergroup(admin)
   at__project = oneof(Project)
 }
 action ProjectsController__unarchive {
   assert inusergroup(admin)
   at__project = oneof(Project)
 }
 action ProjectsController__update {
   assert inusergroup(admin)
   at__project = oneof(Project)
 }
 action ProjectsController__whiteboard {
   assert inusergroup(admin)
   at__project = oneof(Project)
 }

}
class ProjectFile {
action ProjectFilesController__batch_action {}
 action ProjectFilesController__create {
   at__project_file = create ProjectFile
 }
 action ProjectFilesController__destroy {
   at__project_files = subset(ProjectFile)
   delete(at__project_files)
 }
 action ProjectFilesController__edit {
   at__project_file = oneof(ProjectFile)
 }
 action ProjectFilesController__index {
   at__project_files = subset(ProjectFile)
 }
 action ProjectFilesController__new {}
 action ProjectFilesController__show {
   at__project_file = oneof(ProjectFile)
 }
 action ProjectFilesController__update {
   at__project_file = oneof(ProjectFile)
 }
 action ProjectReportController__view {}
}
class Team {
 action TeamsController__batch_action {
   assert (inusergroup(admin) or inusergroup(employee))
 }
 action TeamsController__create {
   assert inusergroup(admin)
   at__team = create Team
 }
 action TeamsController__destroy {
   assert inusergroup(admin)
   at__teams = subset(Team)
   delete(at__teams)
 }
 action TeamsController__edit {
   assert inusergroup(admin)
   at__team = oneof(Team)
 }
 action TeamsController__index {
   assert inusergroup(admin)
   at__teams = subset(Team)
 }
 action TeamsController__new {
   assert inusergroup(admin)
 }
 action TeamsController__show {
   assert inusergroup(admin)
   at__team = oneof(Team)
 }
 action TeamsController__update {
   assert inusergroup(admin)
   at__team = oneof(Team)
 }
}
class Ticket {
 action TicketsController__batch_action {
   assert inusergroup(admin)
 }
 action TicketsController__create {
   assert inusergroup(admin)
   at__ticket = create Ticket
 }
 action TicketsController__destroy {
   assert inusergroup(admin)
   at__tickets = subset(Ticket)
   delete(at__tickets)
 }
 action TicketsController__edit {
   assert inusergroup(admin)
   at__ticket = oneof(Ticket)
 }
 action TicketsController__edit_multiple {
   assert inusergroup(admin)
   collection = oneof(Ticket)
   if (*) {
     foreach ticket: collection {
       if (*) {
         ticket.status = oneof(TicketStatus)
       }
       if (*) {
         ticket.ticket_category = oneof(TicketCategory)
       }
       if (*) {
         ticket.ticket_priority = oneof(TicketPriority)
       }
       if (*) {
         ticket.assignee = oneof(AdminUser)
       }
       ticket_comment = create TicketComment
       ticket_comment.ticket = ticket
       ticket.ticket_comments += ticket_comment
       empty
     }
     empty
   }
 }
 action TicketsController__index {
   raise
   at__tickets = subset(Ticket)
 }
 action TicketsController__move {
   assert inusergroup(admin)
   at__ticket = oneof(Ticket)
 }
 action TicketsController__new {
   assert inusergroup(admin)
 }
 action TicketsController__start_timer {
   assert inusergroup(admin)
   at__ticket = oneof(Ticket)
   at__timer_count = empty
   scope = subset(TicketTimer)
   if (not isempty(scope)) {
     old_timer = tryoneof(scope)
     comment = create TicketComment
     delete(old_timer)
     comment
   }
   at__ticket_timer = create TicketTimer
   at__ticket_timer.admin_user = currentuser
   at__ticket_timer.ticket = at__ticket
 }
 action TicketsController__stop_timer {
   at__comment = empty
   assert inusergroup(admin)
   at__ticket = oneof(Ticket)
   at__ticket_timer = oneof(TicketTimer)
   if (*) {
     at__comment = {
       comment = create TicketComment
       delete(at__ticket_timer)
       comment
     }
     empty
   }
 }
 action TicketsController__ticket_time {
   assert inusergroup(admin)
   at__ticket = oneof(Ticket)
   at__ticket_timer = oneof(TicketTimer)
 }
 action TicketsController__update {
   assert inusergroup(admin)
   at__ticket = oneof(Ticket)
 }
 action TicketsController__update_comment {
   assert inusergroup(admin)
   at__ticket_comment = oneof(TicketComment)
 }
}
class TicketCategory {
action TicketCategoriesController__batch_action {
  assert (inusergroup(admin) or inusergroup(employee))
}
action TicketCategoriesController__create {
  assert inusergroup(admin)
  at__ticket_category = create TicketCategory
}
action TicketCategoriesController__destroy {
  assert inusergroup(admin)
  at__ticket_categories = subset(TicketCategory)
      delete(at__ticket_categories)
}
action TicketCategoriesController__edit {
  assert inusergroup(admin)
  at__ticket_category = oneof(TicketCategory)
}
action TicketCategoriesController__index {
  assert inusergroup(admin)
  at__ticket_categories = subset(TicketCategory)
}
action TicketCategoriesController__new {
  assert inusergroup(admin)
}
action TicketCategoriesController__show {
  assert inusergroup(admin)
  at__ticket_category = oneof(TicketCategory)
}
action TicketCategoriesController__update {
  assert inusergroup(admin)
  at__ticket_category = oneof(TicketCategory)
}

}

class TicketComment {

}
class TicketPriority {
 action TicketPrioritiesController__batch_action {
   assert (inusergroup(admin) or inusergroup(employee))
 }
 action TicketPrioritiesController__create {
   assert inusergroup(admin)
   at__ticket_priority = create TicketPriority
 }
 action TicketPrioritiesController__destroy {
   assert inusergroup(admin)
   at__ticket_priorities = subset(TicketPriority)
   delete(at__ticket_priorities)
 }
 action TicketPrioritiesController__edit {
   assert inusergroup(admin)
   at__ticket_priority = oneof(TicketPriority)
 }
 action TicketPrioritiesController__index {
   assert inusergroup(admin)
   at__ticket_priorities = subset(TicketPriority)
 }
 action TicketPrioritiesController__new {
   assert inusergroup(admin)
 }
 action TicketPrioritiesController__show {
   assert inusergroup(admin)
   at__ticket_priority = oneof(TicketPriority)
 }
 action TicketPrioritiesController__update {
   assert inusergroup(admin)
   at__ticket_priority = oneof(TicketPriority)
 }
}
class TicketStatus {
action TicketReportController__tickets {
  at__tickets = if (*) {
    oneof(Project).tickets
  }
  at__projects = Project
}
action TicketReportController__view {}
action TicketStatusesController__batch_action {
  assert (inusergroup(admin) or inusergroup(employee))
}
action TicketStatusesController__create {
  assert inusergroup(admin)
  at__ticket_status = create TicketStatus
}
action TicketStatusesController__destroy {
  assert inusergroup(admin)
  at__ticket_statuses = subset(TicketStatus)
  delete(at__ticket_statuses)
}
action TicketStatusesController__edit {
  assert inusergroup(admin)
  at__ticket_status = oneof(TicketStatus)
}
action TicketStatusesController__index {
  assert inusergroup(admin)
  at__ticket_statuses = subset(TicketStatus)
}
action TicketStatusesController__new {
  assert inusergroup(admin)
}
action TicketStatusesController__show {
  assert inusergroup(admin)
  at__ticket_status = oneof(TicketStatus)
}
action TicketStatusesController__update {
  assert inusergroup(admin)
  at__ticket_status = oneof(TicketStatus)
}
}
class TicketTimer {

}
class Version {
}