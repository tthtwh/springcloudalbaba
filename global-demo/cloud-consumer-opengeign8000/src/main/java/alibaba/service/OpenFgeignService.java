package alibaba.service;

import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient
public interface OpenFgeignService {

    public int getPaymentById(Long id);

}
