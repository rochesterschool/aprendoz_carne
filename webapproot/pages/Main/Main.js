dojo.declare("Main", wm.Page, {
	start: function() {
		
	},
	"preferredDevice": "desktop",
    // shwo picture
	peopledojoGrid1Select: function(inSender) {
		var codigop= this.peopledojoGrid1.selectedItem.data.codigo;
        this.fotoStd.setSource("http://www.rochester.edu.co/fotosestudiantes/"+codigop+".Jpeg");
	},
    // save suceso
	Registrar_SucesoClick: function(inSender) {
		var idpersona= this.peopledojoGrid1.selectedItem.data.idpersona;
        var tipo= this.tipoSuceso.getDataValue();
        var now = new Date().getTime();
        this.varInsertLog.setValue("persona.idPersona", idpersona);
        this.varInsertLog.setValue("tipoFalla.idTipoFalla", tipo);
        this.varInsertLog.setValue("fechaCreacion", now);
        this.insertLogForm.setDataSet(this.varInsertLog); 
        this.insertLogForm.insertData(); 
	},
    // getting familiar group details
	Registrar_SucesoClick1: function(inSender) {
		var idpersona= this.peopledojoGrid1.selectedItem.data.idpersona;
        var idgrupo= this.peopledojoGrid1.selectedItem.data.idgrupito;
        var tipopersona= this.peopledojoGrid1.selectedItem.data.idtipo;
        var tiposuceso= this.tipoSuceso.getDataValue();
        if(tiposuceso != 7){
          this.getParentsInfo.input.setValue("pgrupo", idgrupo);
          this.getParentsInfo.input.setValue("ppersona", idpersona);
          this.getParentsInfo.update(); 
        }
        if(tipopersona=== 1 && tiposuceso=== 7){
          this.getParentsInfo.input.setValue("pgrupo", idgrupo);
          this.getParentsInfo.input.setValue("ppersona", idpersona);
          this.getParentsInfo.update();  
        }       
	},
    // Using parents info for sending mail
	getParentsInfoSuccess: function(inSender, inDeprecated) {
        var json= main.getParentsInfo.getItem(0);
        var nombreCompleto= this.peopledojoGrid1.selectedItem.data.fullname;
        var fechaCompleta= this.dateTime1.getDisplayValue();
        var correopadre= json.data.correopapa;
        var correomadre= json.data.correomama;
        var motivo= this.tipoSuceso.getDisplayValue();
        
        var idpersona= this.peopledojoGrid1.selectedItem.data.idpersona;
        var idgrupo= this.peopledojoGrid1.selectedItem.data.idgrupito;
        var tipopersona= this.peopledojoGrid1.selectedItem.data.idtipo;
        var tiposuceso= this.tipoSuceso.getDataValue();
        
        if(tiposuceso != 7 && tiposuceso != 8){
            if(confirm("¿Esta seguro de enviar la notificación a los padres?")){    
                this.sendMailsParents.input.setValue("motivo", motivo);
                this.sendMailsParents.input.setValue("alumno", nombreCompleto);
                this.sendMailsParents.input.setValue("correopadre", correopadre);
                this.sendMailsParents.input.setValue("correomadre", correomadre);
                this.sendMailsParents.input.setValue("fechahora", fechaCompleta);
                this.sendMailsParents.update();
            }else{         
                alert("Operación cancelada.");
            }
        }
        if(tipopersona=== 1 && tiposuceso=== 7 || tiposuceso=== 8){
            if(confirm("¿Esta seguro de enviar la notificación a los padres?")){    
                this.mailSpecialParents.input.setValue("motivo", motivo);
                this.mailSpecialParents.input.setValue("alumno", nombreCompleto);
                this.mailSpecialParents.input.setValue("correopadre", correopadre);
                this.mailSpecialParents.input.setValue("correomadre", correomadre);
                this.mailSpecialParents.input.setValue("fechahora", fechaCompleta);
                this.mailSpecialParents.update();
            }else{         
                alert("Operación cancelada.");
            }
        }	
	},
    // peopledojoGrid1Select2 onSelection active the button
	peopledojoGrid1Select2: function(inSender) {
		this.Registrar_Suceso.enable();
	},
    // inserting data to log_ingresos_carne when Teachers / Admons
	Registrar_Suceso_teachersClick: function(inSender) {
	    var idpersona= this.TeachersAdmonDojoGrid1.selectedItem.data.idpersona;
        var tipo= this.tipoSuceso1.getDataValue();
        var now = new Date().getTime();
        this.varInsertLog.setValue("persona.idPersona", idpersona);
        this.varInsertLog.setValue("tipoFalla.idTipoFalla", tipo);
        this.varInsertLog.setValue("fechaCreacion", now);
        this.insertLogForm2.setDataSet(this.varInsertLog); 
        this.insertLogForm2.insertData(); 
	},
    // onClick Registrar_Suceso_teachers
    Registrar_Suceso_teachersClick1: function(inSender) {
    	var idpersona= this.TeachersAdmonDojoGrid1.selectedItem.data.idpersona;
        this.mailTeachersAdmonsServiceVariable1.input.setValue("pdocente",idpersona);
        this.mailTeachersAdmonsServiceVariable1.update();
	},
    // 
    TeachersAdmonDojoGrid1Select: function(inSender) {
        var id= main.TeachersAdmonDojoGrid1.selectedItem.data.numeroDocumento;
        var intCode= parseInt(id);
        this.fotoAdmon.setSource("http://www.rochester.edu.co/fotosempleados/"+intCode+".Jpeg");	
	},
    
	TeachersAdmonDojoGrid1Select1: function(inSender) {
		this.Registrar_Suceso_teachers.enable();
	},
    
	mailTeachersAdmonsServiceVariable1Success: function(inSender, inDeprecated) {
       var motivoCorreo= this.tipoSuceso1.getDisplayValue();
       var nombres= this.TeachersAdmonDojoGrid1.selectedItem.data.nombres;
       var apellidos= this.TeachersAdmonDojoGrid1.selectedItem.data.apellidos;
       var tipo= this.TeachersAdmonDojoGrid1.selectedItem.data.idtipo;
       var nombreCompleto= nombres+" "+apellidos;
       var fechaHora= this.dateTime2.getDisplayValue();
       var items= main.mailTeachersAdmonsServiceVariable1;
       var cont= main.mailTeachersAdmonsServiceVariable1.getCount();
       var correos = [];
       for(var i = 0; i<cont; i++){
           var _item= main.mailTeachersAdmonsServiceVariable1.getItem(i).data;
           var mail= _item.email;
           correos.push(mail);
       }  
       if(tipo==7 || tipo==11 || tipo==13 || tipo==14 || tipo==16 || tipo==17 || tipo==18 || tipo==19  || tipo==20  || tipo==25){
           this.sendMailAdmons.input.setValue("motivo", motivoCorreo);
           this.sendMailAdmons.input.setValue("admon", nombreCompleto);
           this.sendMailAdmons.input.setValue("fechahora", fechaHora);
           this.sendMailAdmons.update();
       }
       if(tipo==4 || tipo==5 || tipo==6 || tipo==8 || tipo==10){
           this.sendMailTeachers.input.setValue("motivo", motivoCorreo);
           this.sendMailTeachers.input.setValue("destinatarios", correos);
           this.sendMailTeachers.input.setValue("docente", nombreCompleto);
           this.sendMailTeachers.input.setValue("fechahora", fechaHora);
           this.sendMailTeachers.update();
       }
	},
	_end: 0
});