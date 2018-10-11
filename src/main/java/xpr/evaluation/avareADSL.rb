class Category {

action CategoriesController__create {
cc_unique code
at__category = create Category
}
action CategoriesController__destroy {
cc_unique code
  at__category = oneof(Category)
  delete(at__category)
}
action CategoriesController__edit {
  at__category = oneof(Category)
}
action CategoriesController__index {
  at__categories = Category
}
action CategoriesController__new {
  at__category = create Category
}
action CategoriesController__show {
  at__category = oneof(Category)
}
action CategoriesController__update {
  at__category = oneof(Category)
}

}

class User {
action UsersController__show {
  at__user = oneof(User)
}
}

class Upload {
action UploadController__handle {

}
action UploadController__index {
  at__search = subset(Upload)
  at__uploads = at__search
}
action UploadController__upload_file {

}
}

class Project {
action ProjectsController__create {
  at__project = create Project
}
action ProjectsController__destroy {
  at__project = oneof(Project)
  delete(at__project)
}
action ProjectsController__edit {
  at__project = oneof(Project)
}
action ProjectsController__index {
  at__projects = Project
}
action ProjectsController__new {
  at__project = create Project
}
action ProjectsController__show {
  at__project = oneof(Project)
}
action ProjectsController__update {
  at__project = oneof(Project)
}
}

class SpecificationLog {

}
class Specification {
action SpecificationsController__create {
  at__specification = create Specification
  at__specification.contractor = currentuser
}
action SpecificationsController__destroy {
  at__specification = oneof(Specification)
  if (((inusergroup(admin) or inusergroup(chief_contractor)) or inusergroup(chief_controller))) {
    at__specification.controller = currentuser
  }
  if (((inusergroup(admin) or inusergroup(chief_contractor)) or inusergroup(chief_controller))) {
    at__specification.contractor = currentuser
  }
  if (((inusergroup(admin) or inusergroup(chief_contractor)) or inusergroup(chief_controller))) {
    at__specification.contractor = currentuser
  }
  if (((inusergroup(admin) or inusergroup(chief_contractor)) or inusergroup(chief_controller))) {
    at__specification.controller = currentuser
  }
}
action SpecificationsController__edit {
  at__specification = oneof(Specification)
}
action SpecificationsController__fsm {}
action SpecificationsController__index {
  at__search = subset(Specification)
  at__specifications = at__search
  at__total_sum_without_delivery = empty
  at__total_sum_with_delivery = empty
  at__total_quantity = empty
  foreach spec : at__specifications {
    at__total_sum_without_delivery = empty
    at__total_sum_with_delivery = empty
    at__total_quantity = empty
  }
}
action SpecificationsController__new {
  at__specification = create Specification
}
action SpecificationsController__show {
  at__specification = oneof(Specification)
}
action SpecificationsController__update {
  at__specification = oneof(Specification)
  if (*) {
    at__specification.contractor = currentuser
  }
  if (*) {
    at__specification.controller = currentuser
  }
}
}
