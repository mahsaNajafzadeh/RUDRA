class Blurb {
action Api_V2_DeploysController__create {}
action Api_V2_DraftBlurbsController__create {
  at__blurbs = empty
  at__locales = empty
}
action Api_V2_DraftBlurbsController__index {}
action Api_V2_PublishedBlurbsController__index {}
action BlurbsController__destroy {
  blurb = oneof(Blurb)
  delete(blurb.localizations)
  delete(blurb)
}
}
class Locale {
 action LocalesController__new {
   at__project = oneof(Project)
 }
}
class Localization {

}
class Project {
action ProjectsController__index {
  at__projects = subset(Project)
}
action ProjectsController__show {
  at__localizations = empty
  at__project = oneof(Project)
  at__locale = if (*) {
    oneof(at__project.locales)
  } else {
    tryoneof(at__project.locales)
  }
  if (*) {
    at__localizations = Localization
  }
}
}
class TextCache {
}
class Version {
action VersionsController__create {
  at__localization = oneof(Localization)
  at__version = create((tryoneof(at__localization.versions).localization).versions)
}
action VersionsController__new {
  at__localization = oneof(Localization)
  at__version = create((tryoneof(at__localization.versions).localization).versions)
  at__project = at__localization.blurb.project
  at__locale = if (not isempty(at__localization.locale)) {
    oneof(at__project.locales)
  } else {
    tryoneof(at__project.locales)
  }
}

}
