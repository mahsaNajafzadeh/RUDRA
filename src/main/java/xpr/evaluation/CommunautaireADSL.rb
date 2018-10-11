class Article {
action ArticlesController__create {
  at__article = create Article
  assert (inusergroup(administrator) and at__article in Article)
  at__category = oneof(Category)
  at__article.category = at__category
  at__article.user = currentuser
}
action ArticlesController__edit {
  at__article = oneof(Article)
  assert (inusergroup(administrator) and at__article in Article)
}
action ArticlesController__index {
  at__addarticle = empty
  at__articles = subset(Article)
  assert ((inusergroup(administrator) and at__articles in Article) or (inusergroup(nonadministrator) and at__articles in Article))
  if (*) {
    if (inusergroup(administrator)) {
      at__addarticle = empty
    }
  }
}
action ArticlesController__new {
  at__article = create Article
  assert (inusergroup(administrator) and at__article in Article)
  at__title = empty
}
action ArticlesController__show {
  at__editarticle = empty
  at__article = oneof(Article)
  assert ((inusergroup(administrator) and at__article in Article) or (inusergroup(nonadministrator) and at__article in Article))
  if (*) {
    if (inusergroup(administrator)) {
      at__editarticle = empty
    }
  }
}
action ArticlesController__update {
  at__article = oneof(Article)
  assert (inusergroup(administrator) and at__article in Article)
  at__category = oneof(Category)
  at__article.category = at__category
  at__article.user = currentuser
  at__content = empty
  at__title = empty
}
}
class Category {

  action CategoriesController__create {
    at__category = create Category
    assert (inusergroup(administrator) and at__category in Category)
    assert (inusergroup(administrator) and at__category in Category)
  }
  action CategoriesController__edit {
    at__category = oneof(Category)
    assert (inusergroup(administrator) and at__category in Category)
    assert (inusergroup(administrator) and at__category in Category)
  }
  action CategoriesController__index {
    at__categories = subset(Category)
    assert ((inusergroup(administrator) and at__categories in Category) or (inusergroup(nonadministrator) and at__categories in Category))
    assert ((inusergroup(administrator) and at__categories in Category) or (inusergroup(nonadministrator) and at__categories in Category))
    at__categories = Category
  }
  action CategoriesController__new {
    at__category = create Category
    assert (inusergroup(administrator) and at__category in Category)
    assert (inusergroup(administrator) and at__category in Category)
  }
  action CategoriesController__show {
    at__category = oneof(Category)
    assert ((inusergroup(administrator) and at__category in Category) or (inusergroup(nonadministrator) and at__category in Category))
    assert ((inusergroup(administrator) and at__category in Category) or (inusergroup(nonadministrator) and at__category in Category))
    at__topics = at__category.topics
  }
  action CategoriesController__update {
    at__category = oneof(Category)
    assert (inusergroup(administrator) and at__category in Category)
    assert (inusergroup(administrator) and at__category in Category)
    at__name = empty
  }
}
class Post {
 action PostsController__create {
   at__post = create Post
   at__topic = oneof(Topic)
   at__post.topic = at__topic
   at__post.user = currentuser
   at__category = oneof(Category)
 }
 action PostsController__edit {
   at__topic = oneof(Topic)
   at__post = oneof(Post)
 }
 action PostsController__index {
   at__posts = tryoneof(Post)
 }
 action PostsController__new {
   at__post = create Post
   at__topic = oneof(Topic)
 }
 action PostsController__show {}
 action PostsController__update {
   at__topic = oneof(Topic)
   at__post = oneof(Post)
   at__content = empty
   at__category = oneof(Category)
 }
}
class Topic {
 action TopicsController__create {
   at__topic = create Topic
   at__category = oneof(Category)
   at__topic.category = at__category
   at__topic.user = currentuser
 }
 action TopicsController__edit {
   at__category = oneof(Category)
   at__topic = oneof(Topic)
 }
 action TopicsController__index {
   at__topics = tryoneof(Topic)
 }
 action TopicsController__new {
   at__topic = create Topic
   at__category = oneof(Category)
 }
 action TopicsController__show {
   at__topic = oneof(Topic)
   at__posts = at__topic.posts
   at__category = oneof(Category)
 }
 action TopicsController__update {
   at__category = oneof(Category)
   at__topic = oneof(Topic)
   at__title = empty
   at__content = empty
   at__description = empty
 }
}
class User {
action UsersController__index {
  at__user = oneof(User)
}
action UsersController__show {
  at__user = oneof(User)
}
}