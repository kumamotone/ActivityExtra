package kumamotone.sample.activityextra

import android.app.Activity
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

private object UNINITIALIZED_EXTRA

fun <T> extra() = object : ReadOnlyProperty<Activity, T> {
    override fun getValue(thisRef: Activity, property: KProperty<*>): T {
        return thisRef.intent.extras?.get(property.name) as T
    }
}