package km.project.kotlinproject.Scope

import android.app.Activity
import android.os.Bundle
import km.project.kotlinproject.R

class KotlinScopeActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scope)

        // apply 함수의 선언형태
        // fun <T> T.apply(bloack: T.() -> Unti): T
        // T라는 객체를 통해서 apply함수가 호출된다. T.()는 람다 리시버라고 하는데
        // 위의 apply함수 선언에서
        // 람다 리비서는 수신자 객체의 타입 T를 block함수의 입력인 T.()로 전달한다.
        // apply함수는 반환값이 수신자 객체자기 자신이다.
        // 그래서 반환하지 않고 수신자 객체의 멤버에서 작동하는 코드블록에 apply를 사용한다.
        

    }
}