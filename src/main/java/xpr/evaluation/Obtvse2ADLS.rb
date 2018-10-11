class Post {
action PostsController__admin {
  at__post = empty
  at__published = empty
  at__drafts = empty
  at__user = currentuser
  if (*) {
    at__post = create Post
    at__published = subset(Post)
    at__drafts = subset(Post)
  }
}
action PostsController__create {
  at__user = currentuser
  at__post = create Post
}
action PostsController__destroy {
  at__user = currentuser
  at__post = oneof(Post)
  delete(at__post)
}
action PostsController__edit {
  at__user = currentuser
  at__post = oneof(Post)
  at__post_path = empty
}
action PostsController__index {
  at__user = currentuser
  at__posts = subset(Post)
}
action PostsController__new {
  at__user = currentuser
  at__post = create Post
  at__post_path = empty
}
action PostsController__show {
  at__user = currentuser
  at__post = oneof(Post)
  at__next = tryoneof(Post)
  at__previous = tryoneof(Post)
}
action PostsController__update {
  at__user = currentuser
  at__post = oneof(Post)
}

}
class User {
action SessionsController__create {
  at__user = currentuser
}
action SessionsController__destroy {
  at__user = currentuser
}
action SessionsController__new {
  at__user = currentuser
}
action SitemapController__index {
  at__user = currentuser
  at__static_pages = empty
  at__users = User
  at__posts = Post
}
action UsersController__create {
  at__user = currentuser
  at__user = create User
}
}
