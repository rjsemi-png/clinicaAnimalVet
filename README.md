# Clínica AnimalVet

Programa para gestionar una clínica veterinaria: clientes, mascotas, citas, consultas, historial clínico y comprobantes de cobro.
El programa tiene dos secciones con pestañas: **Recepción** y **Veterinario**.

# Recepción

## Clientes

Aquí se registra al dueño de la mascota.

1. Escribe la cédula, el nombre, el teléfono y la dirección.
2. Pulsa **Registrar Cliente**.
3. Si la cédula ya estaba registrada, el programa avisa.

<img width="642" height="552" alt="image" src="https://github.com/user-attachments/assets/52be79ce-6909-4197-8b1c-581a8a2d270d" />

## Mascotas

Aquí se registra una mascota y se asocia a su dueño.

1. Escribe la cédula del dueño (debe estar registrado) y el ID, nombre, edad y peso de la mascota.
2. Elige el tipo de mascota:
   - **Convencional:** se escribe la raza.
   - **Exótica:** se escribe el permiso CITES (obligatorio) y se marca si requiere sedación.
3. Pulsa **Registrar Mascota**.

<img width="644" height="556" alt="image" src="https://github.com/user-attachments/assets/208caf54-8604-4c79-b5c0-3bbe585bf22f" />

## Citas y Cobro

Esta pestaña tiene dos partes.

**Agendar una cita**
1. Escribe el ID de la mascota.
2. Elige el veterinario.
3. Escribe la fecha (AAAA-MM-DD) y la hora (HH:MM). Debe ser una fecha futura.
4. Pulsa **Agendar Cita**.

**Generar el comprobante**
1. Elige una consulta de la lista.
2. Pulsa **Generar Comprobante**.
3. El detalle del cobro aparece en el recuadro de abajo.

<img width="645" height="557" alt="image" src="https://github.com/user-attachments/assets/d6d92485-d89b-4240-86f0-e0f0681b6df8" />

## Agenda

Muestra una tabla con todas las citas agendadas: mascota, veterinario, fecha y hora, y estado (pendiente, atendida, etc.). La tabla se actualiza cada vez que se abre la pestaña.

<img width="642" height="555" alt="image" src="https://github.com/user-attachments/assets/f19fe9e4-46d7-473f-8045-edd81c2df9c0" />

---

# Veterinario

## Registrar Consulta

Aquí el veterinario registra la atención de una cita.

1. Escribe el ID de la mascota y elige el veterinario.
2. Escribe el diagnóstico, el tratamiento y las notas médicas.
3. Elige la vacuna aplicada, o deja **Ninguna** si no se aplicó (es opcional).
4. Pulsa **Registrar consulta**.

La mascota debe tener una cita agendada con ese veterinario. Al registrar la consulta, la cita pasa a estado atendida y la consulta queda en el historial.

<img width="638" height="555" alt="image" src="https://github.com/user-attachments/assets/4a9f2a9d-3a30-4753-bc33-749689264c46" />

## Historial Clínico

Muestra todas las consultas de una mascota.

1. Escribe el ID de la mascota.
2. Pulsa **Consultar historial**.
3. Aparecen las consultas con su fecha, veterinario, diagnóstico, tratamiento, notas y vacunas. Si la mascota todavía no tiene consultas, el programa lo indica.

<img width="641" height="552" alt="image" src="https://github.com/user-attachments/assets/df0a95dd-47e8-4d00-8116-df14e4a34647" />
