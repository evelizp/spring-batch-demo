package pe.eveliz.springbatchdemo.writer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pe.eveliz.springbatchdemo.model.MovimientoBanco;
import pe.eveliz.springbatchdemo.model.MovimientoItemOut;
import pe.eveliz.springbatchdemo.repository.MovimientoBancoRepository;

import java.util.List;

@Component
public class MovimientoItemWriter implements ItemWriter<MovimientoItemOut> {
    private static final Logger LOGGER = LoggerFactory.getLogger(MovimientoItemWriter.class);

    @Autowired
    MovimientoBancoRepository movimientoTempRepository;

    @Override
    public void write(List<? extends MovimientoItemOut> items) throws Exception {
        LOGGER.info("Escribiendo los movimientos{}", items);
        for (MovimientoItemOut item: items){
            MovimientoBanco mt = MovimientoBanco
                    .builder()
                    .nroOperacion(item.getNroOperacion())
                    .importe(item.getImporte())
                    .fechaProceso(item.getFechaProceso())
                    .build();
            movimientoTempRepository.save(mt);
        }

    }
}
