package caverspark;

import java.util.List;

/**
 * 
 * @author lin
 *
 */

public interface UserDao {
    public int save(UserEntity userEntity) throws Exception;
    public List selectAll()  throws Exception;
    public UserEntity selectById(int id) throws Exception;
}