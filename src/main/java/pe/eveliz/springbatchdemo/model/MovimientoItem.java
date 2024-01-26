package pe.eveliz.springbatchdemo.model;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class MovimientoItem {

    private String nroOperacion;

    private BigDecimal importe;
}
