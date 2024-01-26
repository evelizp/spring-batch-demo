package pe.eveliz.springbatchdemo.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import pe.eveliz.springbatchdemo.model.MovimientoItem;
import pe.eveliz.springbatchdemo.model.MovimientoItemOut;

import java.time.LocalDate;

public class MovimientoItemProcessor implements ItemProcessor<MovimientoItem, MovimientoItemOut> {
    private static final Logger LOGGER = LoggerFactory.getLogger(MovimientoItemProcessor.class);

    @Override
    public MovimientoItemOut process(MovimientoItem item) throws Exception {
        LOGGER.info("Procesando el movimiento{}", item);
        return MovimientoItemOut
                .builder()
                .nroOperacion(item.getNroOperacion())
                .importe(item.getImporte())
                .fechaProceso(LocalDate.now())
                .build();
    }
}
