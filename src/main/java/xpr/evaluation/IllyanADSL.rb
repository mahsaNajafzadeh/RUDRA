class Group {

}
 class Person {
action Admin_PeopleController__change_password {
  at__person = oneof(Person)
  assert ((inusergroup(admin) and at__person in Person) or (inusergroup(nonadmin) and at__person in currentuser))
  assert (inusergroup(admin) and at__person in Person)
}
action Admin_PeopleController__create {
  at___current_service = empty
  at__person = create Person
  assert (inusergroup(admin) and at__person in Person)
  assert (inusergroup(admin) and at__person in Person)
  at__person = oneof(Person)
  if (*) {
    if (not isempty(at___current_service)) {
      if (isempty(at___current_service)) {
        if (*) {
          at___current_service = oneof(Service)
        }
      }
      at___current_service
    }
    empty
  } else {
    if (not isempty({
      if (isempty(at___current_service)) {
        if (*) {
          at___current_service = oneof(Service)
        }
      }
      at___current_service
    })) {
      if (not {
        if (isempty(at___current_service)) {
          if (*) {
            at___current_service = oneof(Service)
          }
        }
        at___current_service
      } in at__person.services) {
        at__person.services += {
          if (isempty(at___current_service)) {
            if (*) {
              at___current_service = oneof(Service)
            }
          }
          at___current_service
        }
      }
    }
  }
}
action Admin_PeopleController__edit {
  at___current_service = empty
  if (*) {
    at___current_service = oneof(Service)
  }
  at__person = oneof(Person)
  assert ((inusergroup(admin) and at__person in Person) or (inusergroup(nonadmin) and at__person in currentuser))
  assert (inusergroup(admin) and at__person in Person)
}
action Admin_PeopleController__edit_account {
  at___current_service = empty
  if (*) {
    at___current_service = oneof(Service)
  }
  at__person = oneof(Person)
  assert ((inusergroup(admin) and at__person in Person) or (inusergroup(nonadmin) and at__person in currentuser))
  assert (inusergroup(admin) and at__person in Person)
}
action Admin_PeopleController__index {
  at___current_service = empty
  if (*) {
    at___current_service = oneof(Service)
  }
  at__people = subset(Person)
  assert ((inusergroup(admin) and at__people in Person) or (inusergroup(nonadmin) and at__people in currentuser))
  assert (inusergroup(admin) and at__people in Person)
  assert (inusergroup(admin) and at__people in Person)
  at__people = subset(Person)
}
action Admin_PeopleController__new {
  at___current_service = empty
  if (*) {
    at___current_service = oneof(Service)
  }
  at__person = create Person
  assert (inusergroup(admin) and at__person in Person)
  assert (inusergroup(admin) and at__person in Person)
}
action Admin_PeopleController__show {
  at___current_service = empty
  if (*) {
    at___current_service = oneof(Service)
  }
  at__person = oneof(Person)
  assert ((inusergroup(admin) and at__person in Person) or (inusergroup(nonadmin) and at__person in currentuser))
  assert (inusergroup(admin) and at__person in Person)
}
action Admin_PeopleController__update {
  at___current_service = empty
  if (*) {
    at___current_service = oneof(Service)
  }
  at__person = oneof(Person)
  assert ((inusergroup(admin) and at__person in Person) or (inusergroup(nonadmin) and at__person in currentuser))
  assert (inusergroup(admin) and at__person in Person)
}
action ProfilesController__change_password {
  at___current_service = empty
  if (*) {
    at___current_service = oneof(Service)
  }
  at__person = currentuser
}
action ProfilesController__edit {
  at___current_service = empty
  if (*) {
    at___current_service = oneof(Service)
  }
  at__person = currentuser
}
action ProfilesController__show {
  at___current_service = empty
  if (*) {
    at___current_service = oneof(Service)
  }
  at__person = currentuser
}
action ProfilesController__update {
  at___current_service = empty
  if (*) {
    at___current_service = oneof(Service)
  }
at__person = currentuser
}
action HomeController__index {
  at___current_service = empty
  if (*) {
    at___current_service = oneof(Service)
  }
  at__services = subset(Service)
  if (*) {
    at__services = union(at__services, currentuser.services)
  }
}
}
class Service {
action ServicesController__create {
  at___current_service = empty
  if (*) {
    at___current_service = oneof(Service)
  }
  at__service = create Service
  assert (inusergroup(admin) and at__service in Service)
}
action ServicesController__destroy {
  at___current_service = empty
  if (*) {
    at___current_service = oneof(Service)
  }
  at__service = oneof(Service)
  assert (inusergroup(admin) and at__service in Service)
  delete(oneof(Service))
}
action ServicesController__edit {
  at___current_service = empty
  if (*) {
    at___current_service = oneof(Service)
  }
  at__service = oneof(Service)
  assert (inusergroup(admin) and at__service in Service)
}
action ServicesController__index {
  at___current_service = empty
  if (*) {
    at___current_service = oneof(Service)
  }
  at__services = subset(Service)
  assert (inusergroup(admin) and at__services in Service)
  at__services = Service
}
action ServicesController__new {
  at___current_service = empty
  if (*) {
    at___current_service = oneof(Service)
  }
  at__service = create Service
  assert (inusergroup(admin) and at__service in Service)
}
action ServicesController__update {
  at___current_service = empty
  if (*) {
    at___current_service = oneof(Service)
  }
  at__service = oneof(Service)
  assert (inusergroup(admin) and at__service in Service)
}
action SessionsController__create {
  at___current_service = empty
  if (*) {
    at___current_service = oneof(Service)
  }
  if (*) {
    at___current_service = oneof(Service)
  }
}
}