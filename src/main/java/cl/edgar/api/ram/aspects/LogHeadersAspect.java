package cl.edgar.api.ram.aspects;

import cl.edgar.api.ram.annotations.LogHeaders;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;


@Aspect
@Component
public class LogHeadersAspect {

    /** LOGGER. */
    private final Logger LOGGER = LoggerFactory.getLogger(LogHeadersAspect.class);

    @Pointcut("@annotation(cl.edgar.api.ram.annotations.LogHeaders)")
    public void logHeadersAnnotation() {
    }

    @Before("@annotation(logHeadersAnnotation)")
    public void logHeadersBefore(final JoinPoint joinPoint, final LogHeaders logHeadersAnnotation) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        final String valorRut = request.getHeader("rut");
        final String texto = logHeadersAnnotation.texto();
        LOGGER.info(texto, valorRut);
    }

}
