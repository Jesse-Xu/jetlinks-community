package org.jetlinks.community.dashboard;

import org.jetlinks.core.metadata.ConfigMetadata;
import org.jetlinks.core.metadata.DataType;
import reactor.core.publisher.Flux;

/**
 * 指标维度,如: 每小时,服务器1
 * @author zhouhao
 */
public interface MeasurementDimension {

    DimensionDefinition getDefinition();

    DataType getValueType();

    ConfigMetadata getParams();

    boolean isRealTime();

    Flux<MeasurementValue> getValue(MeasurementParameter parameter);

}
