package test.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * Created by Administrator on 2016/10/18.
 */
@Entity
data class Customer(
        var firstName:String ="",
        var lastName: String = "",
        @Id @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
        var id: Long = 0
)