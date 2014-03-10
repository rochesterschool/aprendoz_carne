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
          console.log(idpersona+" "+idgrupo);
          this.getParentsInfo.input.setValue("pgrupo", idgrupo);
          this.getParentsInfo.input.setValue("ppersona", idpersona);
          this.getParentsInfo.update(); 
        }
        if(tipopersona=== 1 && tiposuceso=== 7){
          console.log(idpersona+" "+idgrupo);
          this.getParentsInfo.input.setValue("pgrupo", idgrupo);
          this.getParentsInfo.input.setValue("ppersona", idpersona);
          this.getParentsInfo.update();  
        }       
	},
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
    
	peopledojoGrid1Select2: function(inSender) {
		this.Registrar_Suceso.enable();
	},
    
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
    
    Registrar_Suceso_teachersClick1: function(inSender) {
	  
	},
    
    TeachersAdmonDojoGrid1Select: function(inSender) {
      var id= main.TeachersAdmonDojoGrid1.selectedItem.data.numeroDocumento;
      var intCode= parseInt(id);
      this.fotoAdmon.setSource("http://www.rochester.edu.co/fotosempleados/"+intCode+".Jpeg");	
	},
    
	TeachersAdmonDojoGrid1Select1: function(inSender) {
		this.Registrar_Suceso_teachers.enable();
	},
	_end: 0
});