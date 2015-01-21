package org.http4s
package json4s
package native

import org.json4s.native.JsonMethods

import scala.text.Document

trait Json4sNativeInstances extends Json4sInstances[Document] {
  override protected def jsonMethods: org.json4s.JsonMethods[Document] = JsonMethods
}
