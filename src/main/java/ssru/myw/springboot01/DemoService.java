package ssru.myw.springboot01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class DemoService {
    @Autowired
    private DemoMapper demoMapper;

    public List<Demo> likeName(String name) {
        return demoMapper.likeName(name);
    }
    @Transactional
    public void save(Demo demo) {
         demoMapper.save(demo);
    }
}
