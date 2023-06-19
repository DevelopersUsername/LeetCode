SELECT patient_id, patient_name, conditions
FROM Patients
WHERE conditions Like 'DIAB1%' OR conditions Like '% DIAB1%'