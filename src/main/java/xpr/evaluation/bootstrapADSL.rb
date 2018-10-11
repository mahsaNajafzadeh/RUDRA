class Role {

}
class User {
action UsersController__destroy {
  user = oneof(User)
  if (not equal(user, currentuser)) {
    delete(user)
    empty
  }
 }
action UsersController__destroy0 {
    user0 = oneof(User)
    if (not equal(user0, currentuser0)) {
      delete(user0)
      empty
    }
}
action UsersController__index {
   at__users = User
 }
action UsersController__index0 {
  at__users0 = User
}
action UsersController__show {
  at__user = oneof(User)
}
action UsersController__show0 {
  at__user0 = oneof(User)
}
action UsersController__update {
  at__user = oneof(User)
}
action UsersController__update0 {
  at__user0 = oneof(User)
}
}