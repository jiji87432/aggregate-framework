package org.aggregateframework.test.dao;

import org.aggregateframework.test.command.domain.entity.SeatAvailability;
import org.aggregateframework.dao.DomainObjectDao;

import java.util.Collection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-10-12
 * Time: 下午5:31
 * To change this template use File | Settings | File Templates.
 */
public interface SeatAvailabilityDao extends DomainObjectDao<SeatAvailability, Integer> {

    List<SeatAvailability> findByOrderIds(Collection<Integer> orderIds);
    List<SeatAvailability> findByOrderId(Integer orderId);
}