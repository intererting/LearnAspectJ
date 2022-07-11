import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * author        yiliyang
 * date          2022-07-11
 * time          下午2:02
 * version       1.0
 * since         1.0
 */
@Aspect
public class Advices {

//    @Before("execution(* *())")
//    public void before() {
//        System.out.println("before");
//    }
//
//    @After("execution(* *())")
//    public void after() {
//        System.out.println("after");
//    }
//
//    @AfterReturning(value = "execution(* *())", returning = "result")
//    public void afterReturning(String result) {
//        System.out.println("afterReturning " + result);
//    }
//
//    @AfterThrowing(value = "execution(* *())", throwing = "e")
//    public void afterThrowing(Throwable e) {
//        System.out.println("afterThrowing " + e.getMessage());
//    }

    //    @Around(value = "execution(* *()) && within(Person)")
    @Around(value = "execution(* *..test())")
    public Object around(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println(joinPoint.getTarget());
            System.out.println(joinPoint.getThis());
//            System.out.println("before around");
            Object result = joinPoint.proceed();
//            System.out.println("after around");
            return result;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

}
