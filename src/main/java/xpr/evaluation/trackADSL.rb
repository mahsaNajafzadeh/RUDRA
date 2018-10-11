class Attachment {
action CalendarController__show {
  at__user = empty
  if (*) {
    if (not isempty(user = tryoneof(User))) {
      at__user = user
      true
    } else {
      true
    }
  } else {
    true
  }
  at__z_index_counter = empty
  at__group_view_by = empty
}
}
class Context {
action ContextsController__all_done_todos {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__source_view = empty
  at__sidebar = empty
}
action ContextsController__create {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__context = create(currentuser.contexts)
  at__context_not_done_counts = empty
}
action ContextsController__destroy {
  at__context = empty
  at__z_index_counter = empty
  at__group_view_by = empty
  if (*) {
    at__context = empty
  } else {
    at__context = oneof(currentuser.contexts)
  }
  if (*) {
    foreach e: at__context.recurring_todos {
      if (*) {
        foreach t: e.todos {
          t.recurring_todo = empty
          true
        }
      }
    }
  }
  delete(at__context.todos)
  delete(at__context.recurring_todos)
  delete(at__context)
}
action ContextsController__done_todos {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__source_view = empty
  at__sidebar = empty
}
action ContextsController__edit {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__source_view = empty
  at__sidebar = empty
  at__context = oneof(Context)
}
action ContextsController__index {
  at__user = empty
  if (*) {
    if (not isempty(user = tryoneof(User))) {
      at__user = user
      true
    } else {
      true
    }
  } else {
    true
  }
  at__z_index_counter = empty
  at__group_view_by = empty
}
action ContextsController__order {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action ContextsController__show {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__source_view = empty
  at__sidebar = empty
}
action ContextsController__update {
  at__context = empty
  at__z_index_counter = empty
  at__group_view_by = empty
  at__source_view = empty
  at__sidebar = empty
  if (*) {
    at__context = empty
  } else {
    at__context = oneof(currentuser.contexts)
  }
}
}
class Dependency {
action DataController__csv_actions {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action DataController__csv_import {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action DataController__csv_map {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action DataController__csv_notes {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action DataController__import {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action DataController__index {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__page_title = empty
}
action DataController__xml_export {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action DataController__yaml_export {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action FeedlistController__get_feeds_for_context {
  raise
}
action FeedlistController__get_feeds_for_project {
  raise
}
action FeedlistController__index {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action IntegrationsController__cloudmailin {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action IntegrationsController__index {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__page_title = empty
}
action IntegrationsController__rest_api {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__page_title = empty
}
action IntegrationsController__search_plugin {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__icon_data = empty
}
action LoginController__check_expiry {
  at__user = empty
  at__z_index_counter = empty
  at__group_view_by = empty
  if (*) {
    at__user = oneof(User)
  }
}
action LoginController__login {
  at__user = empty
  at__z_index_counter = empty
  at__group_view_by = empty
  if (*) {
    at__user = oneof(User)
  }
  at__page_title = empty
  at__login = empty
}
action LoginController__logout {
  at__user = empty
  at__z_index_counter = empty
  at__group_view_by = empty
  if (*) {
    at__user = oneof(User)
  }
}
action MailgunController__mailgun {
  at__z_index_counter = empty
  at__group_view_by = empty
}
}
class Note {
action NotesController__create {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__source_view = empty
  at__note = create(currentuser.notes)
}
action NotesController__destroy {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__source_view = empty
  at__note = oneof(currentuser.notes)
  delete(at__note)
}
action NotesController__index {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__source_view = empty
  at__all_notes = currentuser.notes
  at__count = empty
  at__page_title = empty
}
action NotesController__show {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__source_view = empty
  at__note = oneof(currentuser.notes)
  at__page_title = empty
}
action NotesController__update {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__source_view = empty
  at__note = oneof(currentuser.notes)
}

}
class Preference {
action PreferencesController__index {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__page_title = empty
  at__prefs = currentuser.preference
  at__user = currentuser
}
action PreferencesController__render_date_format {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action PreferencesController__update {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__prefs = currentuser.preference
  at__user = currentuser
}
}
class Project {
action ProjectsController__actionize {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__source_view = empty
}
action ProjectsController__all_done_todos {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__source_view = empty
}
action ProjectsController__alphabetize {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__source_view = empty
}
action ProjectsController__create {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__source_view = empty
  if (*) {
    default_context = if (isempty(Context)) {
      create Context
    } else {
      oneof(Context)
    }
    default_context
  }
   at__project=create project
}
action ProjectsController__destroy {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__source_view = empty
  at__project = oneof(currentuser.projects)
  foreach e: at__project.recurring_todos {
    e.project = empty
    true
  }
  delete(at__project.todos)
  delete(at__project.notes)
  delete(at__project)
}
action ProjectsController__done {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__source_view = empty
}
action ProjectsController__done_todos {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__source_view = empty
}
action ProjectsController__edit {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__source_view = empty
  at__project = oneof(currentuser.projects)
}
action ProjectsController__index {
  at__user = empty
  if (*) {
    if (not isempty(user = tryoneof(User))) {
      at__user = user
      true
    } else {
      true
    }
  } else {
    true
  }
  at__z_index_counter = empty
  at__group_view_by = empty
  at__source_view = empty
}
action ProjectsController__order {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__source_view = empty
}
action ProjectsController__review {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__source_view = empty
}
action ProjectsController__set_reviewed {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__source_view = empty
  at__project = oneof(currentuser.projects)
}
action ProjectsController__show {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__source_view = empty
  at__project = oneof(currentuser.projects)
}
action ProjectsController__update {
  at__sidebar = empty
  at__new_state = empty
  at__z_index_counter = empty
  at__group_view_by = empty
  at__source_view = empty
  at__project = oneof(currentuser.projects)
  if (*) {
    default_context = if (isempty(Context)) {
      create Context
    } else {
      oneof(Context)
    }
    default_context
  }
  if (*) {
    at__new_state = empty
    true
  }
  if (*) {
    at__sidebar = empty
    empty
  }
}
}
class RecurringTodo {
action RecurringTodosController__create {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__days_of_week = empty
  at__months_of_year = empty
  at__xth_day = empty
  at__projects = currentuser.projects
  at__contexts = currentuser.contexts
  at__recurringTodo=create RecurringTodo
}
action RecurringTodosController__destroy {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__recurring_todo = oneof(currentuser.recurring_todos)
}
action RecurringTodosController__done {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action RecurringTodosController__edit {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__days_of_week = empty
  at__months_of_year = empty
  at__xth_day = empty
  at__projects = currentuser.projects
  at__contexts = currentuser.contexts
  at__recurring_todo = oneof(currentuser.recurring_todos)
  at__form_helper = empty
}
action RecurringTodosController__index {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__days_of_week = empty
  at__months_of_year = empty
  at__xth_day = empty
  at__projects = currentuser.projects
  at__contexts = currentuser.contexts
}
action RecurringTodosController__new {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__days_of_week = empty
  at__months_of_year = empty
  at__xth_day = empty
  at__projects = currentuser.projects
  at__contexts = currentuser.contexts
}
action RecurringTodosController__show {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action RecurringTodosController__toggle_check {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__recurring_todo = oneof(currentuser.recurring_todos)
}
action RecurringTodosController__toggle_star {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__recurring_todo = oneof(currentuser.recurring_todos)
}
action RecurringTodosController__update {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__recurring_todo = oneof(currentuser.recurring_todos)
}
}
class Tag {
 action SearchController__index {
   at__z_index_counter = empty
   at__group_view_by = empty
   at__page_title = empty
 }
 action SearchController__results {
   at__z_index_counter = empty
   at__group_view_by = empty
   at__source_view = empty
   at__page_title = empty
   at__results = empty
   at__count = empty
 }
 action StatsController__actions_completion_time_data {
   at__z_index_counter = empty
   at__group_view_by = empty
   at__me = empty
   at__today = empty
   at__cut_off_year = empty
   at__cut_off_year_plus3 = empty
   at__cut_off_month = empty
   at__cut_off_30days = empty
 }
 action StatsController__actions_day_of_week_30days_data {
   at__z_index_counter = empty
   at__group_view_by = empty
   at__me = empty
   at__today = empty
   at__cut_off_year = empty
   at__cut_off_year_plus3 = empty
   at__cut_off_month = empty
   at__cut_off_30days = empty
 }
 action StatsController__actions_day_of_week_all_data {
   at__z_index_counter = empty
   at__group_view_by = empty
   at__me = empty
   at__today = empty
   at__cut_off_year = empty
   at__cut_off_year_plus3 = empty
   at__cut_off_month = empty
   at__cut_off_30days = empty
 }
 action StatsController__actions_done_last12months_data {
   at__z_index_counter = empty
   at__group_view_by = empty
   at__me = empty
   at__today = empty
   at__cut_off_year = empty
   at__cut_off_year_plus3 = empty
   at__cut_off_month = empty
   at__cut_off_30days = empty
 }
 action StatsController__actions_done_last30days_data {
   at__z_index_counter = empty
   at__group_view_by = empty
   at__me = empty
   at__today = empty
   at__cut_off_year = empty
   at__cut_off_year_plus3 = empty
   at__cut_off_month = empty
   at__cut_off_30days = empty
 }
 action StatsController__actions_done_last_years {
   at__z_index_counter = empty
   at__group_view_by = empty
   at__me = empty
   at__today = empty
   at__cut_off_year = empty
   at__cut_off_year_plus3 = empty
   at__cut_off_month = empty
   at__cut_off_30days = empty
   at__page_title = empty
   at__chart = empty
 }
 action StatsController__actions_done_lastyears_data {
   at__z_index_counter = empty
   at__group_view_by = empty
   at__me = empty
   at__today = empty
   at__cut_off_year = empty
   at__cut_off_year_plus3 = empty
   at__cut_off_month = empty
   at__cut_off_30days = empty
 }
 action StatsController__actions_open_per_week_data {
   at__z_index_counter = empty
   at__group_view_by = empty
   at__me = empty
   at__today = empty
   at__cut_off_year = empty
   at__cut_off_year_plus3 = empty
   at__cut_off_month = empty
   at__cut_off_30days = empty
 }
 action StatsController__actions_running_time_data {
   at__z_index_counter = empty
   at__group_view_by = empty
   at__me = empty
   at__today = empty
   at__cut_off_year = empty
   at__cut_off_year_plus3 = empty
   at__cut_off_month = empty
   at__cut_off_30days = empty
 }
 action StatsController__actions_time_of_day_30days_data {
   at__z_index_counter = empty
   at__group_view_by = empty
   at__me = empty
   at__today = empty
   at__cut_off_year = empty
   at__cut_off_year_plus3 = empty
   at__cut_off_month = empty
   at__cut_off_30days = empty
 }
 action StatsController__actions_time_of_day_all_data {
   at__z_index_counter = empty
   at__group_view_by = empty
   at__me = empty
   at__today = empty
   at__cut_off_year = empty
   at__cut_off_year_plus3 = empty
   at__cut_off_month = empty
   at__cut_off_30days = empty
 }
 action StatsController__actions_visible_running_time_data {
   at__z_index_counter = empty
   at__group_view_by = empty
   at__me = empty
   at__today = empty
   at__cut_off_year = empty
   at__cut_off_year_plus3 = empty
   at__cut_off_month = empty
   at__cut_off_30days = empty
 }
 action StatsController__context_running_actions_data {
   at__z_index_counter = empty
   at__group_view_by = empty
   at__me = empty
   at__today = empty
   at__cut_off_year = empty
   at__cut_off_year_plus3 = empty
   at__cut_off_month = empty
   at__cut_off_30days = empty
   at__data = empty
 }
 action StatsController__context_total_actions_data {
   at__z_index_counter = empty
   at__group_view_by = empty
   at__me = empty
   at__today = empty
   at__cut_off_year = empty
   at__cut_off_year_plus3 = empty
   at__cut_off_month = empty
   at__cut_off_30days = empty
   at__data = empty
 }
 action StatsController__done {
   at__z_index_counter = empty
   at__group_view_by = empty
   at__me = empty
   at__today = empty
   at__cut_off_year = empty
   at__cut_off_year_plus3 = empty
   at__cut_off_month = empty
   at__cut_off_30days = empty
 }
action StatsController__index {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action StatsController__show_selected_actions_from_chart {
  raise
}
}
class Tagging {

}
class Todo {
action TodosController__add_predecessor {
  at__status_message = empty
  at__predecessor_array = empty
  at__z_index_counter = empty
  at__group_view_by = empty
  at__source_view = empty
  at__predecessor = oneof(currentuser.todos)
  at__predecessors = at__predecessor.successor_dependencies.predecessor
  at__todo = oneof(currentuser.todos)
  at__original_state = empty
  if (*) {
    false
  } else {
    if (*) {
      false
    } else {
      if (*) {
        at__predecessor_array = at__todo.successor_dependencies.predecessor
        at__predecessor_array
      }
      true
    }
    at__status_message = empty
    if (*) {
      at__status_message = empty
    }
  }
}
action TodosController__all_done {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action TodosController__all_done_tag {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action TodosController__attachment {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action TodosController__auto_complete_for_predecessor {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action TodosController__change_context {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__todo = oneof(currentuser.todos)
  at__original_item_context_id = at__todo.context
  at__original_item = create(currentuser.todos)
  at__context = oneof(currentuser.contexts)
  at__todo.context = at__context
  at__status_message = empty
}
action TodosController__check_deferred {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action TodosController__convert_to_project {
  at__z_index_counter = empty
  at__group_view_by = empty
  todo = oneof(currentuser.todos)
  at__project = {
    project =  create Project
      delete(todo.predecessor_dependencies)
      delete(todo.successor_dependencies)
      delete(todo.attachments)
      delete(todo)
      true
    project
  }
}
action TodosController__create {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__todo=create todo
}
action TodosController__defer {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action TodosController__destroy {
  at__new_recurring_todo = empty
  at__z_index_counter = empty
  at__group_view_by = empty
  at__source_view = empty
  at__todo = oneof(currentuser.todos)
  at__original_item = create(currentuser.todos)
  at__original_item_due = empty
  at__context_id = at__todo.context
  at__project_id = at__todo.project
  at__uncompleted_predecessors = empty
  at__pending_to_activate = empty
  at__saved = {
    delete(at__todo.predecessor_dependencies)
    delete(at__todo.successor_dependencies)
    delete(at__todo.attachments)
    delete(at__todo)
  }
    delete(at__todo.predecessor_dependencies)
    delete(at__todo.successor_dependencies)
    delete(at__todo.attachments)
    delete(at__todo)
    at__new_recurring_todo = empty
}
action TodosController__done {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action TodosController__done_tag {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action TodosController__edit {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__todo = oneof(currentuser.todos)
  at__source_view = empty
  at__tag_name = empty
}
action TodosController__filter_to_context {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action TodosController__filter_to_project {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action TodosController__index {
  at__user = empty
  if (*) {
    if (not isempty(user = tryoneof(User))) {
      at__user = user
      true
    } else {
      true
    }
  } else {
    true
  }
  at__z_index_counter = empty
  at__group_view_by = empty
}
action TodosController__list_deferred {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action TodosController__new {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action TodosController__remove_predecessor {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__source_view = empty
  at__todo = oneof(currentuser.todos)
  at__predecessor = oneof(currentuser.todos)
  at__predecessors = at__predecessor.successor_dependencies.predecessor
  at__successor = at__todo
  at__removed = empty
}
action TodosController__show {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__todo = oneof(currentuser.todos)
}
action TodosController__show_notes {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__todo = oneof(currentuser.todos)
  at__return_path = empty
}
action TodosController__tag {
  at__user = empty
  if (*) {
    if (not isempty(user = tryoneof(User))) {
      at__user = user
      true
    } else {
      true
    }
  } else {
    true
  }
  at__z_index_counter = empty
  at__group_view_by = empty
}
action TodosController__tags {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action TodosController__toggle_check {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__todo = oneof(currentuser.todos)
  at__source_view = empty
  at__original_item = create(currentuser.todos)
  at__original_item_due = empty
  at__original_item_context_id = at__todo.context
  at__original_item_project_id = at__todo.project
  at__original_completed_period = empty
  at__saved = empty
  at__predecessors = at__todo.successor_dependencies.predecessor
}
action TodosController__toggle_star {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__todo = oneof(currentuser.todos)
}
action TodosController__update {
  at__z_index_counter = empty
  at__group_view_by = empty
}
}
 class User {
action UsersController__change_auth_type {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__page_title = empty
}
action UsersController__change_password {
  at__z_index_counter = empty
  at__group_view_by = empty
  at__page_title = empty
}
action UsersController__create {
  at__user = empty
  at__z_index_counter = empty
  at__group_view_by = empty
  create User
  if (*) {
    if (*) {
      at__user = if (*) {
        candidate = tryoneof(User)
        if (*) {
          if (*) {
            candidate
          }
        }
      }
      create(at__user.preference)
      if (*) {
        at__user
      }
    }
    empty
  }
}
action UsersController__destroy {
  at__z_index_counter = empty
  at__group_view_by = empty
  assert inusergroup(oneof(User), admin)
  at__deleted_user = oneof(User)
  at__saved = {
    delete(at__deleted_user.contexts)
    delete(at__deleted_user.projects)
    delete(at__deleted_user.todos)
    delete(at__deleted_user.recurring_todos)
    delete(at__deleted_user.notes)
    delete(at__deleted_user.preference)
    delete(at__deleted_user)
  }
  at__total_users = empty
}
action UsersController__index {
  at__z_index_counter = empty
  at__group_view_by = empty
  assert inusergroup(oneof(User), admin)
  at__page_title = empty
  at__users = subset(User)
  at__total_users = empty
}
action UsersController__new {
  at__admin_email = empty
  at__page_title = empty
  at__heading = empty
  at__z_index_counter = empty
  at__group_view_by = empty
  at__auth_types = empty
  at__user = tryoneof(User)
  if (inusergroup(at__user, admin)) {
    at__page_title = empty
    at__heading = empty
    at__user = {
      user = empty
      if (*) {
        user = oneof(User)
        empty
      } else {
        user = create User
      }
      user
    }
    empty
  } else {
    at__page_title = empty
    at__admin_email = empty
    empty
  }
}
action UsersController__refresh_token {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action UsersController__refresh_token {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action UsersController__show {
  at__z_index_counter = empty
  at__group_view_by = empty
  assert inusergroup(oneof(User), admin)
  at__user = oneof(User)
}
action UsersController__update_auth_type {
  at__z_index_counter = empty
  at__group_view_by = empty
}
action UsersController__update_password {
  at__z_index_counter = empty
  at__group_view_by = empty
}
}