class Accessorisation {

}
class Accessory {
action AccessoriesController__update {}
}


class Attachment {
action Admin_AttachmentsController__create {
  at__product = oneof(Product)
  at__attachment = empty
}
action Admin_AttachmentsController__destroy {
  at__product = oneof(Product)
  at__attachment = oneof(Attachment)
  delete(at__attachment)
}
action Admin_AttachmentsController__edit {
  at__product = oneof(Product)
  at__attachment = oneof(Attachment)
}
action Admin_AttachmentsController__new {
  at__product = oneof(Product)
  at__attachment = empty
}
action Admin_AttachmentsController__show {
  at__product = oneof(Product)
  at__attachment = oneof(Attachment)
}
action Admin_AttachmentsController__update {
  at__product = oneof(Product)
  at__attachment = oneof(Attachment)
}
}

class user {
action Admin_UsersController__edit {
  at__attachment = empty
  at__user = oneof(User)
  assert ((inusergroup(admin) and at__user in User) or (inusergroup(nonadmin) and at__user in User))
  at__user = currentuser
  if (*) {
    at__attachment = create Attachment
    at__attachment
  }
}
action Admin_UsersController__update {
  at__user = oneof(User)
  assert ((inusergroup(admin) and at__user in User) or (inusergroup(nonadmin) and at__user in User))
  at__user = currentuser
}
action Users_RegistrationsController__cancel {}
action Users_RegistrationsController__create {}
action Users_RegistrationsController__destroy {}
action Users_RegistrationsController__edit {}
action Users_RegistrationsController__new {}
action Users_RegistrationsController__update {}
action Users_SessionsController__create {}
action Users_SessionsController__destroy {}
action Users_SessionsController__new {}
}

class sku {
action SkusController__notify {
  at__sku = oneof(Sku)
  at__notification = create Notification
}
action SkusController__update {
}
action StoreController__home {
  at__new_products = subset(Product)
  at__featured_products = subset(Product)
}

}

class Address {

 }
 class ContactMessage {

  }

class Cart {
action CartsController__checkout {
  at__delivery_id = empty
  at__delivery_address = empty
  at__billing_address = empty
  at__delivery_service_prices = empty
  at__order = if (*) {
    create Order
  } else {
    oneof(Cart).order
  }
  at__cart_total = {
    at__net_amount = empty
    at__tax_amount = empty
    at__gross_amount = empty
    empty
  }
  at__country = empty
  if (*) {
    at__delivery_service_prices = subset(DeliveryServicePrice)
  }
  if (*) {
    at__delivery_id = oneof(Cart).estimate_delivery
    at__delivery_address = create(at__order.delivery_address)
    at__billing_address = create( at__order.billing_address)
  } else {
    at__delivery_id = at__order.delivery
  }
}
action CartsController__confirm {
  at__order = empty
  at__net_amount = empty
  at__tax_amount = empty
  at__gross_amount = empty
  at__cart_total = empty
  at__country = empty
  at__delivery_service_prices = empty
      create Order
  if (*) {
    at__order = if (*) {
      create Order
    } else {
      oneof(Cart).order
    }
    at__cart_total = {
      at__net_amount = empty
      at__tax_amount = empty
      at__gross_amount = empty
      empty
    }
    at__country = empty
    if (*) {
      at__delivery_service_prices = subset(DeliveryServicePrice)
    }
    empty
  }
}
action CartsController__estimate {
  at__cart = oneof(Cart)
}
action CartsController__mycart {}
action CartsController__purge_estimate {
  at__cart = oneof(Cart)
  at__cart.estimate_delivery = empty
}
}

class CartItem {
action CartItemsController__create {
  at__final_delivery_service_prices = empty
  at__sku = empty
  if (*) {
    at__sku = oneof(Sku)
  } else {
    at__cart_item = oneof(CartItem)
    at__sku = at__cart_item.sku
  }
  at__quantity = empty
  at__cart = oneof(Cart)
  if (*) {
    at__cart.estimate_delivery = empty
    true
  }
  at__cart_item = {
    current_item = tryoneof(cart_items)
    if (*) {
      if (*) {
        current_item = create((oneof(Cart).cart_items))
      } else {
        current_item = create(cart_items)
        create(current_item.cart_item_accessory)
      }
      empty
    }
    current_item
  }
  if (not isempty(oneof(Cart).cart_items)) {
    at__final_delivery_service_prices = empty
    empty
  }
}
action CartItemsController__destroy {
  at__final_delivery_service_prices = empty
  at__cart = oneof(Cart)
  if (*) {
    at__cart.estimate_delivery = empty
    true
  }
  at__cart_item = oneof(CartItem)
  delete(at__cart_item.cart_item_accessory)
  delete(at__cart_item)
  if (not isempty(oneof(Cart).cart_items)) {
    at__final_delivery_service_prices = empty
    empty
  }
}
action CartItemsController__update {
  at__final_delivery_service_prices = empty
  at__cart_item = empty
  at__sku = empty
  if (*) {
    at__sku = oneof(Sku)
  } else {
    at__cart_item = oneof(CartItem)
    at__sku = at__cart_item.sku
  }
  at__quantity = empty
  at__cart = oneof(Cart)
  if (*) {
    at__cart.estimate_delivery = empty
    true
  }
  at__accessory = if (not isempty(at__cart_item.cart_item_accessory)) {
    at__cart_item.cart_item_accessory.accessory
  }
  if (*) {
    delete(at__cart_item.cart_item_accessory)
    delete(at__cart_item)
  } else {
    true
  }
  if (not isempty(oneof(Cart).cart_items)) {
    at__final_delivery_service_prices = empty
    empty
  }
}Category

}


class CartItemAccessory {
}

class Category {
action CategoriesController__show {
  at__category = oneof(Category)
}
}

class Country {

}

class DeliveryService {
action Admin_DeliveryServicesController__copy_countries {
  at__countries = Country
  at__delivery_services = subset(DeliveryService)
}
action Admin_DeliveryServicesController__create {
  at__countries = Country
  at__delivery_service = create DeliveryService
}
action Admin_DeliveryServicesController__destroy {
  at__result = empty
  at__delivery_service = oneof(DeliveryService)
  at__countries = Country
        delete(at__delivery_service)
  if (isempty(at__delivery_service.prices.orders)) {
    at__result = if (*) {
      delete(at__delivery_service.prices)
      delete(at__delivery_service.destinations)
      delete(at__delivery_service)
      empty
    }
  } else {
    false
  }
  if (*) {
    at__result = empty
  }
}
action Admin_DeliveryServicesController__edit {
  at__delivery_service = oneof(DeliveryService)
  at__countries = Country
  at__form_delivery_service = oneof(DeliveryService)
}
action Admin_DeliveryServicesController__index {
  at__countries = Country
  at__delivery_services = subset(DeliveryService)
}
action Admin_DeliveryServicesController__new {
  at__countries = Country
  at__delivery_service = create DeliveryService
}
action Admin_DeliveryServicesController__set_countries {
  at__countries = empty
  at__delivery_service = empty
  if (*) {
    at__countries = Country
    at__delivery_service = oneof(DeliveryService)
    empty
  }
}
action Admin_DeliveryServicesController__update {
  at__form_delivery_service = empty
  at__old_delivery_service = empty
  at__delivery_service = oneof(DeliveryService)
  at__countries = Country
  if (not isempty(at__delivery_service.prices.orders)) {
    at__old_delivery_service = at__delivery_service
    at__delivery_service = create DeliveryService
  }
  if (*) {
    at__form_delivery_service = at__old_delivery_service = if (isempty(at__old_delivery_service)) {
      oneof(DeliveryService)
    } else {
      at__old_delivery_service
    }
    empty
  }
}
}

class DeliveryServicePrice {
action DeliveryServicePricesController__update {
  at__delivery_service_prices = subset(DeliveryServicePrice)
  at__delivery_service_price = create price
  at__field_target = empty
  }
action DeliveryServicePricesController__new {
      at__delivery_service_price = create price
}
action DeliveryServicePricesController__create {
      at__delivery_service_price = create price
}
action DeliveryServicePricesController__destroy {
      delete(at__delivery_service_price)
}


}
class Destination {

}

class Notification {
}
class Order {
action OrdersController__confirm {
  at__order = subset(Order)
  if (*) {
    at__order = oneof(Order)
  }
  at__delivery_address = at__order.delivery_address
  at__billing_address = at__order.billing_address
}
action OrdersController__destroy {
  at__order = subset(Order)
  if (*) {
    at__order = oneof(Order)
  }
  at__order.cart = empty
}
action OrdersController__failed {
  at__order = oneof(Order)
}
action OrdersController__retry {
  at__fatal_codes = empty
  at__order = subset(Order)
  if (*) {
    at__order = oneof(Order)
  }
  at__error_code = empty
    at__order.cart = oneof(Cart)
}
action OrdersController__success {
  at__order = oneof(Order)
}
action OrdersController__complete {
  at__order = subset(Order)
  if (*) {
    at__order = oneof(Order)
  }
  delete(at__order.order_items.order_item_accessory)
  delete(at__order.order_items)
  foreach item : oneof(Cart).cart_items {
    order_item = create(at__order.order_items)
      create(order_item.order_item_accessory)
    true
  }
}

action OrdersController__cancel {
at__stock_adjustment = create stockdjustment
}
}

class OrderItem {

}

class OrderItemAccessory {

}

class Page {
action Admin_PagesController__edit {
  at__page = subset(Page)
  if (*) {
    at__page = oneof(Page)
  }
  at__template_types = subset(Page)
  if (*) {
    at__template_types = empty
  }
}
action Admin_PagesController__index {
  at__pages = Page
}
action Admin_PagesController__update {
  at__page = subset(Page)
  if (*) {
    at__page = oneof(Page)
  }
  at__template_types = subset(Page)
  if (*) {
    at__template_types = empty
  }
}
}

class Permission {

}

class Product {
action ProductsController__show {
  at__cart_item_accessory = empty
  at__product = oneof(Product)
  at__cart_item = create CartItem
  if (not isempty(at__product.accessorisations.accessory)) {
    at__cart_item_accessory = create(at__cart_item.cart_item_accessory)
  }
}

}

class RedactorRails_Asset {

}

class RedactorRails_Document extends RedactorRails_Asset {

}
class RedactorRails_Picture extends RedactorRails_Asset {
}
class RelatedProduct {

}
class Role {

}
fcart

class SkuVariant {

}
class StockAdjustment {
action Admin_Products_StockController__show {
  at__sku = oneof(Sku)
  at__stock_adjustments = subset(at__sku.stock_adjustments)
  at__stock_adjustment = create(at__sku.stock_adjustments)
}

}
class StoreSetting {
}
class Tag {
action Admin_Products_TagsController__index {
  at__tags = empty
}
}
class Tagging {

}
class Transaction {
action Admin_TransactionsController__paypal_ipn {}
}
 class User {
 action Admin_UsersController__update {
   at__user = oneof(User)
   assert ((inusergroup(admin) and at__user in User) or (inusergroup(nonadmin) and at__user in User))
   at__user = currentuser
 }

}
class VariantType {

}