class Account {
 action AccountsController__create {
   at__current_account = empty
   at__current_account = if (isempty(at__current_account)) {
     oneof(Account)
   } else {
     at__current_account
   }
   at__account = create Account
   if (*) {
     create(at__account.confidences)
     create(at__account.confidences)
     create(at__account.confidences)
     create(at__account.confidences)
     create(at__account.products)
     create(at__account.products)
     create(at__account.products)
     create(at__account.products)
     create(at__account.products)
     empty
   }
 }
 action AccountsController__destroy {
   at__current_account = empty
   at__current_account = if (isempty(at__current_account)) {
     oneof(Account)
   } else {
     at__current_account
   }
   at__account = oneof(Account)
   delete(at__account)
 }
 action AccountsController__edit {
   at__current_account = empty
   at__current_account = if (isempty(at__current_account)) {
     oneof(Account)
   } else {
     at__current_account
   }
   at__account = oneof(Account)
 }
 action AccountsController__index {
   at__current_account = empty
   at__current_account = if (isempty(at__current_account)) {
     oneof(Account)
   } else {
     at__current_account
   }
   at__accounts = Account
 }
 action AccountsController__new {
   at__current_account = empty
   at__current_account = if (isempty(at__current_account)) {
     oneof(Account)
   } else {
     at__current_account
   }
   at__account = create Account
 }
 action AccountsController__show {
   at__current_account = empty
   at__current_account = if (isempty(at__current_account)) {
     oneof(Account)
   } else {
     at__current_account
   }
   at__account = oneof(Account)
 }
 action AccountsController__update {
   at__current_account = empty
   at__current_account = if (isempty(at__current_account)) {
     oneof(Account)
   } else {
     at__current_account
   }
   at__account = oneof(Account)
 }
}
class Confidence {
 action ConfidencesController__create {
   at__current_account = empty
   at__current_account = if (isempty(at__current_account)) {
     oneof(Account)
   } else {
     at__current_account
   }
   assert inusergroup(administrator)
   at__confidence = create(at__current_account.confidences)
 }
 action ConfidencesController__destroy {
   at__current_account = empty
   at__current_account = if (isempty(at__current_account)) {
     oneof(Account)
   } else {
     at__current_account
   }
   assert inusergroup(administrator)
   at__confidence = oneof(at__current_account.confidences)
   delete(at__confidence)
 }
 action ConfidencesController__edit {
   at__current_account = empty
   at__current_account = if (isempty(at__current_account)) {
     oneof(Account)
   } else {
     at__current_account
   }
   assert inusergroup(administrator)
   at__confidence = oneof(at__current_account.confidences)
 }
 action ConfidencesController__index {
   at__current_account = empty
   at__current_account = if (isempty(at__current_account)) {
     oneof(Account)
   } else {
     at__current_account
   }
   assert ((inusergroup(administrator) or inusergroup(salesman)) or inusergroup(associate))
   at__confidences = at__current_account.confidences
 }
 action ConfidencesController__new {
   at__current_account = empty
   at__current_account = if (isempty(at__current_account)) {
     oneof(Account)
   } else {
     at__current_account
   }
   assert inusergroup(administrator)
   at__confidence = create Confidence
 }
 action ConfidencesController__show {
   at__current_account = empty
   at__current_account = if (isempty(at__current_account)) {
     oneof(Account)
   } else {
     at__current_account
   }
   assert ((inusergroup(administrator) or inusergroup(salesman)) or inusergroup(associate))
   at__confidence = oneof(at__current_account.confidences)
 }
 action ConfidencesController__update {
   at__current_account = empty
   at__current_account = if (isempty(at__current_account)) {
     oneof(Account)
   } else {
     at__current_account
   }
   assert inusergroup(administrator)
   at__confidence = oneof(at__current_account.confidences)
 }
}
class Customer {
  action CustomersController__destroy {
    at__current_account = empty
    at__current_account = if (isempty(at__current_account)) {
      oneof(Account)
    } else {
      at__current_account
    }
    assert (inusergroup(administrator) or inusergroup(salesman))
    at__customer = oneof(at__current_account.customers)
    delete(at__customer)
  }
  action CustomersController__edit {
    at__current_account = empty
    at__current_account = if (isempty(at__current_account)) {
      oneof(Account)
    } else {
      at__current_account
    }
    assert (inusergroup(administrator) or inusergroup(salesman))
    at__customer = oneof(at__current_account.customers)
  }
  action CustomersController__index {
    at__current_account = empty
    at__current_account = if (isempty(at__current_account)) {
      oneof(Account)
    } else {
      at__current_account
    }
    assert ((inusergroup(administrator) or inusergroup(salesman)) or inusergroup(associate))
    at__customers = at__current_account.customers
  }
  action CustomersController__new {
    at__current_account = empty
    at__current_account = if (isempty(at__current_account)) {
      oneof(Account)
    } else {
      at__current_account
    }
    assert (inusergroup(administrator) or inusergroup(salesman))
    at__customer = create Customer
  }
  action CustomersController__show {
    at__current_account = empty
    at__current_account = if (isempty(at__current_account)) {
      oneof(Account)
    } else {
      at__current_account
    }
    assert ((inusergroup(administrator) or inusergroup(salesman)) or inusergroup(associate))
    at__customer = oneof(at__current_account.customers)
  }
  action CustomersController__update {
    at__current_account = empty
    at__current_account = if (isempty(at__current_account)) {
      oneof(Account)
    } else {
      at__current_account
    }
    assert (inusergroup(administrator) or inusergroup(salesman))
    at__customer = oneof(at__current_account.customers)
  }
  action ForecastController__index {
    at__current_account = empty
    at__current_account = if (isempty(at__current_account)) {
      oneof(Account)
    } else {
      at__current_account
    }
    at__opportunities = subset(Opportunity)
    at__bookings = subset(at__current_account.opportunities)
    at__confidences = at__current_account.confidences
    at__salesmen = subset(at__current_account.users)
  }
  action HomeController__index {
    at__current_account = empty
    at__current_account = if (isempty(at__current_account)) {
      oneof(Account)
    } else {
      at__current_account
    }
    at__opportunities = at__current_account.opportunities
    at__bookings = subset(at__opportunities)
    at__forecast = subset(at__opportunities)
    at__recent_status_changes = subset(at__opportunities)
    at__stale = subset(at__forecast)
    at__recent_wins = subset(at__recent_status_changes)
    at__recent_losses = subset(at__recent_status_changes)
    at__recent_dead = subset(at__recent_status_changes)
    at__recent_forecast = subset(at__recent_status_changes)
  }
}
class LineItem {

}
class OpportunityRecord {

}
class  Opportunity  {
  action OpportunitiesController__show {
    at__current_account = empty
    at__current_account = if (isempty(at__current_account)) {
      oneof(Account)
    } else {
      at__current_account
    }
    assert ((inusergroup(administrator) or inusergroup(salesman)) or inusergroup(associate))
    at__opportunity = oneof(at__current_account.opportunities)
  }
  action OpportunitiesController__update {
    at__current_account = empty
    at__current_account = if (isempty(at__current_account)) {
      oneof(Account)
    } else {
      at__current_account
    }
    at__confidences = subset(at__current_account.confidences)
    at__products = at__current_account.products
    assert (inusergroup(administrator) or inusergroup(salesman))
    at__opportunity = oneof(at__current_account.opportunities)
    at__opportunity.customer = if (isempty(at__current_account.customers)) {
      create(at__current_account.customers)
    } else {
      oneof(at__current_account.customers)
    }
  }
  action OpportunitiesController__index {
    at__current_account = empty
    at__current_account = if (isempty(at__current_account)) {
      oneof(Account)
    } else {
      at__current_account
    }
    assert ((inusergroup(administrator) or inusergroup(salesman)) or inusergroup(associate))
    at__opportunities = subset(Opportunity)
    at__salesmen = subset(at__current_account.users)
  }
  action OpportunitiesController__new {
    at__current_account = empty
    at__current_account = if (isempty(at__current_account)) {
      oneof(Account)
    } else {
      at__current_account
    }
    at__confidences = subset(at__current_account.confidences)
    at__products = at__current_account.products
    assert (inusergroup(administrator) or inusergroup(salesman))
    at__opportunity = create Opportunity
    at__opportunity.confidence = tryoneof(at__confidences)
  }
  action OpportunitiesController__destroy {
    at__current_account = empty
    at__current_account = if (isempty(at__current_account)) {
      oneof(Account)
    } else {
      at__current_account
    }
    at__confidences = subset(at__current_account.confidences)
    at__products = at__current_account.products
    assert (inusergroup(administrator) or inusergroup(salesman))
    at__opportunity = oneof(at__current_account.opportunities)
    delete(at__opportunity.line_items)
    delete(at__opportunity)
  }
  action OpportunitiesController__edit {
    at__current_account = empty
    at__current_account = if (isempty(at__current_account)) {
      oneof(Account)
    } else {
      at__current_account
    }
    at__confidences = subset(at__current_account.confidences)
    at__products = at__current_account.products
    assert (inusergroup(administrator) or inusergroup(salesman))
    at__opportunity = oneof(at__current_account.opportunities)
  }
  action OpportunitiesController__create {
    at__current_account = empty
    at__current_account = if (isempty(at__current_account)) {
      oneof(Account)
    } else {
      at__current_account
    }
    at__confidences = subset(at__current_account.confidences)
    at__products = at__current_account.products
    assert (inusergroup(administrator) or inusergroup(salesman))
    at__opportunity = create(at__current_account.opportunities)
    at__opportunity.user = currentuser
    at__opportunity.customer = if (isempty(at__current_account.customers)) {
      create(at__current_account.customers)
    } else {
      oneof(at__current_account.customers)
    }
  }
}
class Product {
action ProductsController__create {
  at__current_account = empty
  at__current_account = if (isempty(at__current_account)) {
    oneof(Account)
  } else {
    at__current_account
  }
  at__product = create(at__current_account.products)
}
action ProductsController__destroy {
  at__current_account = empty
  at__current_account = if (isempty(at__current_account)) {
    oneof(Account)
  } else {
    at__current_account
  }
  at__product = oneof(at__current_account.products)
  delete(at__product)
}
action ProductsController__edit {
  at__current_account = empty
  at__current_account = if (isempty(at__current_account)) {
    oneof(Account)
  } else {
    at__current_account
  }
  at__product = oneof(at__current_account.products)
}
action ProductsController__index {
  at__current_account = empty
  at__current_account = if (isempty(at__current_account)) {
    oneof(Account)
  } else {
    at__current_account
  }
  at__products = at__current_account.products
}
action ProductsController__new {
  at__current_account = empty
  at__current_account = if (isempty(at__current_account)) {
    oneof(Account)
  } else {
    at__current_account
  }
  at__product = create Product
}
action ProductsController__show {
  at__current_account = empty
  at__current_account = if (isempty(at__current_account)) {
    oneof(Account)
  } else {
    at__current_account
  }
  at__product = oneof(at__current_account.products)
}
action ProductsController__update {
  at__current_account = empty
  at__current_account = if (isempty(at__current_account)) {
    oneof(Account)
  } else {
    at__current_account
  }
  at__product = oneof(at__current_account.products)
}
}
class Target {
}
 class User {
 action UsersController__create {
   at__current_account = empty
   at__current_account = if (isempty(at__current_account)) {
     oneof(Account)
   } else {
     at__current_account
   }
   at__user = create(at__current_account.users)
 }
 action UsersController__destroy {
   at__current_account = empty
   at__current_account = if (isempty(at__current_account)) {
     oneof(Account)
   } else {
     at__current_account
   }
   at__user = oneof(at__current_account.users)
   delete(at__user)
 }
 action UsersController__edit {
   at__current_account = empty
   at__current_account = if (isempty(at__current_account)) {
     oneof(Account)
   } else {
     at__current_account
   }
   at__user = oneof(at__current_account.users)
 }
 action UsersController__index {
   at__current_account = empty
   at__current_account = if (isempty(at__current_account)) {
     oneof(Account)
   } else {
     at__current_account
   }
   at__search = subset(User)
   at__users = if (*) {
     at__search
   } else {
     at__current_account.users
   }
 }
 action UsersController__new {
   at__current_account = empty
   at__current_account = if (isempty(at__current_account)) {
     oneof(Account)
   } else {
     at__current_account
   }
   at__user = create User
 }
 action UsersController__show {
   at__current_account = empty
   at__current_account = if (isempty(at__current_account)) {
     oneof(Account)
   } else {
     at__current_account
   }
   at__user = oneof(at__current_account.users)
 }
 action UsersController__update {
   at__current_account = empty
   at__current_account = if (isempty(at__current_account)) {
     oneof(Account)
   } else {
     at__current_account
   }
    at__user = oneof(at__current_account.users)
    }
}