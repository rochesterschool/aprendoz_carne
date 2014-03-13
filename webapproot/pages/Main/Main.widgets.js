Main.widgets = {
	monthsVar: ["wm.Variable", {"isList":true,"json":"[{name: \"January\", dataValue: 0}, {name: \"February\", dataValue: 1},{name: \"March\", dataValue: 2},{name: \"April\", dataValue: 3},{name: \"May\", dataValue: 4},{name: \"June\", dataValue: 5},{name: \"July\", dataValue: 6},{name: \"August\", dataValue: 7},{name: \"September\", dataValue: 8},{name: \"October\", dataValue: 9},{name: \"November\", dataValue: 10},{name: \"December\", dataValue: 11}]","type":"EntryData"}, {}],
	varTemplateUsername: ["wm.ServiceVariable", {"autoUpdate":true,"operation":"getUserName","service":"securityService","startUpdate":true}, {}, {
		input: ["wm.ServiceInput", {"type":"getUserNameInputs"}, {}]
	}],
	varTemplateLogout: ["wm.LogoutVariable", {}, {}, {
		input: ["wm.ServiceInput", {"type":"logoutInputs"}, {}]
	}],
	varTemplateLogout1: ["wm.LogoutVariable", {}, {}, {
		input: ["wm.ServiceInput", {"type":"logoutInputs"}, {}]
	}],
	searchUsersDetails: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"getDetailsUser","service":"aprendoz_desarrolloDB"}, {}, {
		input: ["wm.ServiceInput", {"type":"getDetailsUserInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":"4","targetProperty":"idsy"}, {}],
				wire1: ["wm.Wire", {"expression":undefined,"source":"searchBox.dataValue","targetProperty":"search"}, {}]
			}]
		}]
	}],
	varInsertLog: ["wm.Variable", {"type":"com.aprendoz_desarrollodb.data.LogIngresoCarne"}, {}],
	lsTipoSucesos: ["wm.LiveVariable", {"inFlightBehavior":"executeLast","type":"com.aprendoz_desarrollodb.data.TipoFalla"}, {}, {
		liveView: ["wm.LiveView", {"dataType":"com.aprendoz_desarrollodb.data.TipoFalla","view":[
{"caption":"IdTipoFalla","sortable":true,"dataIndex":"idTipoFalla","type":"java.lang.Integer","displayType":"Number","required":true,"readonly":true,"includeLists":true,"includeForms":true,"order":0,"subType":null},
{"caption":"TipoFalla","sortable":true,"dataIndex":"tipoFalla","type":"java.lang.String","displayType":"Text","required":true,"readonly":false,"includeLists":true,"includeForms":true,"order":1,"subType":null}
]}, {}]
	}],
	templateUsernameVar: ["wm.ServiceVariable", {"autoUpdate":true,"operation":"getUserName","service":"securityService","startUpdate":true}, {}, {
		input: ["wm.ServiceInput", {"type":"getUserNameInputs"}, {}]
	}],
	templateLogoutVar: ["wm.LogoutVariable", {}, {}, {
		input: ["wm.ServiceInput", {"type":"logoutInputs"}, {}]
	}],
	registroInsertado: ["wm.NavigationCall", {"operation":"showToast"}, {}, {
		input: ["wm.ServiceInput", {"type":"showToastInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":"\"Evento guardado exitosamente!\"","targetProperty":"content"}, {}],
				wire1: ["wm.Wire", {"expression":"3000","targetProperty":"duration"}, {}],
				wire2: ["wm.Wire", {"expression":"\"Success\"","targetProperty":"cssClasses"}, {}],
				wire3: ["wm.Wire", {"expression":"\"bottom center\"","targetProperty":"dialogPosition"}, {}]
			}]
		}]
	}],
	errorInsercion: ["wm.NavigationCall", {"operation":"showToast"}, {}, {
		input: ["wm.ServiceInput", {"type":"showToastInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":"\"Error al registrar el evento. Por favor comuniquese con Sistemas.\"","targetProperty":"content"}, {}],
				wire1: ["wm.Wire", {"expression":"3000","targetProperty":"duration"}, {}],
				wire2: ["wm.Wire", {"expression":"\"Error\"","targetProperty":"cssClasses"}, {}],
				wire3: ["wm.Wire", {"expression":"\"bottom center\"","targetProperty":"dialogPosition"}, {}]
			}]
		}]
	}],
	getParentsInfo: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"orientacionInvolucradosGrupoFamiliar","service":"aprendoz_desarrolloDB"}, {"onSuccess":"getParentsInfoSuccess"}, {
		input: ["wm.ServiceInput", {"type":"orientacionInvolucradosGrupoFamiliarInputs"}, {}]
	}],
	sendMailsParents: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"enviarNotificacionFaltaGrave","service":"enviarMail"}, {"onError":"errorEnvioMail","onSuccess":"successEnvioMail"}, {
		input: ["wm.ServiceInput", {"type":"enviarNotificacionFaltaGraveInputs"}, {}]
	}],
	successEnvioMail: ["wm.NavigationCall", {"operation":"showToast"}, {}, {
		input: ["wm.ServiceInput", {"type":"showToastInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire1: ["wm.Wire", {"expression":"4000","targetProperty":"duration"}, {}],
				wire3: ["wm.Wire", {"expression":"\"top center\"","targetProperty":"dialogPosition"}, {}],
				wire: ["wm.Wire", {"expression":"\"Notificación enviada exitosamente.\"","targetProperty":"content"}, {}],
				wire2: ["wm.Wire", {"expression":"\"Success\"","targetProperty":"cssClasses"}, {}]
			}]
		}]
	}],
	errorEnvioMail: ["wm.NavigationCall", {"operation":"showToast"}, {}, {
		input: ["wm.ServiceInput", {"type":"showToastInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":"\"Notificación no enviada, por favor comuníquese con el Area de Sistemas y reporte el inconveniente.\"","targetProperty":"content"}, {}],
				wire1: ["wm.Wire", {"expression":"5000","targetProperty":"duration"}, {}],
				wire2: ["wm.Wire", {"expression":"\"Warning\"","targetProperty":"cssClasses"}, {}],
				wire3: ["wm.Wire", {"expression":"\"top center\"","targetProperty":"dialogPosition"}, {}]
			}]
		}]
	}],
	mailSpecialParents: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"enviarNotificacionAlmuerzo","service":"specialMessage"}, {}, {
		input: ["wm.ServiceInput", {"type":"enviarNotificacionAlmuerzoInputs"}, {}]
	}],
	logoutVariable1: ["wm.LogoutVariable", {"inFlightBehavior":"executeLast"}, {}, {
		input: ["wm.ServiceInput", {"type":"logoutInputs"}, {}]
	}],
	teachersAdmonsSearchSv: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","maxResults":100,"operation":"getTeachersDetails","service":"aprendoz_desarrolloDB"}, {}, {
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"layoutBox1","targetProperty":"loadingDialog"}, {}]
		}],
		input: ["wm.ServiceInput", {"type":"getTeachersDetailsInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":undefined,"source":"searchBox_teachers.dataValue","targetProperty":"search"}, {}]
			}]
		}]
	}],
	mailTeachersAdmonsServiceVariable1: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"getDirNivelInfo","service":"aprendoz_desarrolloDB"}, {"onSuccess":"mailTeachersAdmonsServiceVariable1Success"}, {
		input: ["wm.ServiceInput", {"type":"getDirNivelInfoInputs"}, {}]
	}],
	sendMailTeachers: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"enviarNotificacionAlmuerzoDocentes","service":"enviarDirNivel"}, {}, {
		input: ["wm.ServiceInput", {"type":"enviarNotificacionAlmuerzoDocentesInputs"}, {}]
	}],
	sendMailAdmons: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"enviarNotificacionAlmuerzoDocentes","service":"admonSendMail"}, {}, {
		input: ["wm.ServiceInput", {"type":"enviarNotificacionAlmuerzoDocentesInputs"}, {}]
	}],
	loadingDialog1: ["wm.LoadingDialog", {"caption":"Consultando información...","serviceVariableToTrack":["searchUsersDetails"]}, {}, {
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"peopledojoGrid1","targetProperty":"widgetToCover"}, {}]
		}]
	}],
	layoutBox1: ["wm.Layout", {"horizontalAlign":"left","padding":"5,50,50,50","styles":{},"verticalAlign":"top"}, {}, {
		SearchListDetail: ["wm.Panel", {"height":"100%","horizontalAlign":"left","styles":{},"verticalAlign":"top","width":"100%"}, {}, {
			searchBarPanel: ["wm.Panel", {"_classes":{"domNode":["toolbar"]},"height":"36px","layoutKind":"left-to-right","styles":{"backgroundColor":"#d3d3d3"},"verticalAlign":"middle","width":"100%"}, {}, {
				searchBtn: ["wm.Button", {"border":"1","caption":"Buscar","height":"30px","margin":"4","mobileHeight":"30%","showing":false,"styles":{},"width":"110px"}, {"onclick":"searchUsersDetails"}],
				SecurityComponents: ["wm.Panel", {"height":"35px","horizontalAlign":"center","layoutKind":"left-to-right","styles":{},"verticalAlign":"top","width":"100%"}, {}, {
					templateUserNameLabel: ["wm.Label", {"_classes":{"domNode":["wm_FontSizePx_10px"]},"align":"right","height":"100%","padding":"4","styles":{"fontSize":"9px"},"width":"100%"}, {}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":"\"Bienvenid@, \" + ${templateUsernameVar.dataValue}","targetProperty":"caption"}, {}]
						}]
					}],
					templateLogoutButton: ["wm.Button", {"_classes":{"domNode":["wm_FontSizePx_10px"]},"border":"1","borderColor":"#666666","caption":"Salir","height":"30px","iconMargin":"0 20px 0 0","imageIndex":42,"imageList":"app.silkIconList","margin":"2","styles":{}}, {"onclick":"templateLogoutVar"}]
				}]
			}],
			breadcrumbLayers1: ["wm.TabLayers", {"styles":{}}, {}, {
				search_estudents: ["wm.Layer", {"border":"1","borderColor":"","caption":"Estudiantes","horizontalAlign":"left","padding":"10","styles":{},"themeStyleType":"ContentPanel","verticalAlign":"top"}, {}, {
					header_search: ["wm.Panel", {"height":"35px","horizontalAlign":"left","layoutKind":"left-to-right","styles":{"backgroundColor":"#22a7f0"},"verticalAlign":"middle","width":"100%"}, {}, {
						searchBox: ["wm.Text", {"changeOnKey":true,"dataValue":undefined,"displayValue":"","height":"30px","placeHolder":"ingrese el nombre del alumno","styles":{},"width":"300px"}, {"onchange":"searchUsersDetails"}]
					}],
					content_students: ["wm.Panel", {"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
						peopledojoGrid1: ["wm.DojoGrid", {"_classes":{"domNode":["Striped"]},"columns":[
{"show":false,"field":"PHONE COLUMN","title":"-","width":"100%","align":"left","expression":"\"<div class='MobileRowTitle'>\" +\n\"Código: \" + ${codigo} +\n\"</div>\"\n\n+ \"<div class='MobileRow'>\" +\n\"Curso: \" + ${curso}\n + \"</div>\"\n\n+ \"<div class='MobileRow'>\" +\n\"Nombre completo: \" + ${fullname}\n + \"</div>\"\n\n+ \"<div class='MobileRow'>\" +\n\"Tipo: \" + ${documento}\n + \"</div>\"\n\n+ \"<div class='MobileRow'>\" +\n\"No. Documento: \" + ${nodocumento}\n + \"</div>\"\n\n","mobileColumn":true},
{"show":false,"field":"idgrupito","title":"Idgrupito","width":"100px","align":"left","formatFunc":"","editorProps":null,"mobileColumn":false},
{"show":true,"field":"codigo","title":"Código","width":"80px","align":"left","formatFunc":"","mobileColumn":false},
{"show":true,"field":"curso","title":"Curso","width":"100px","align":"left","formatFunc":"","mobileColumn":false},
{"show":true,"field":"fullname","title":"Nombre completo","width":"100%","align":"left","formatFunc":"","editorProps":null,"mobileColumn":false},
{"show":true,"field":"documento","title":"Tipo","width":"80px","align":"left","formatFunc":"","mobileColumn":false},
{"show":true,"field":"nodocumento","title":"No. Documento","width":"120px","align":"left","formatProps":{"dijits":0},"editorProps":null,"mobileColumn":false},
{"show":false,"field":"tipo","title":"Tipo","width":"100%","align":"left","formatFunc":"","editorProps":null,"mobileColumn":false},
{"show":false,"field":"year","title":"Year","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"idsy","title":"Idsy","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"idcurso","title":"Idcurso","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"idpersona","title":"Idpersona","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"grupo","title":"Grupo","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"idtipo","title":"Idtipo","width":"100%","displayType":"Java.lang.Integer","align":"left","formatFunc":""}
],"dsType":"com.aprendoz_desarrollodb.data.output.GetDetailsUserRtnType","height":"300px","localizationStructure":{},"margin":"0","minDesktopHeight":60,"singleClickEdit":true,"styles":{"fontSize":"13px"}}, {"onSelect":"peopledojoGrid1Select","onSelect1":"peopledojoGrid1Select1","onSelect2":"peopledojoGrid1Select2"}, {
							binding: ["wm.Binding", {}, {}, {
								wire: ["wm.Wire", {"expression":undefined,"source":"searchUsersDetails","targetProperty":"dataSet"}, {}]
							}]
						}],
						liveFormOuterPanel: ["wm.Panel", {"height":"100%","layoutKind":"left-to-right","padding":"0,10,10,10","styles":{},"width":"100%"}, {}, {
							liveFormInnerPanel: ["wm.Panel", {"border":"1","height":"100%","padding":"0,20,20,20","roles":["7","10"],"styles":{"backgroundColor":"#fafafa","borderRadius":"15px"},"width":"100%"}, {}, {
								insertLogForm: ["wm.LiveForm", {"height":"233px","horizontalAlign":"center","layoutKind":"left-to-right","styles":{},"verticalAlign":"top"}, {"onError":"errorInsercion","onSuccess":"registroInsertado"}, {
									fotoStd: ["wm.Picture", {"_classes":{"domNode":["roundedImg"]},"aspect":"v","border":"1","borderColor":"#bbb","height":"190px","source":"resources/images/default.png","styles":{},"width":"200px"}, {}],
									spacer2: ["wm.Spacer", {"height":"48px","width":"36px"}, {}],
									panel1: ["wm.Panel", {"border":"1","borderColor":"#494343","height":"200px","horizontalAlign":"right","margin":"5","padding":"5","styles":{"borderRadius":"5px","backgroundColor":"#ffffff"},"verticalAlign":"top","width":"299px"}, {}, {
										tipoSuceso: ["wm.SelectMenu", {"caption":"Evento","captionAlign":"right","dataField":"idTipoFalla","dataType":"com.aprendoz_desarrollodb.data.TipoFalla","dataValue":undefined,"displayField":"tipoFalla","displayValue":"","height":"30px","styles":{},"width":"100%"}, {}, {
											binding: ["wm.Binding", {}, {}, {
												wire: ["wm.Wire", {"expression":undefined,"source":"lsTipoSucesos","targetProperty":"dataSet"}, {}]
											}]
										}],
										dateTime1: ["wm.DateTime", {"caption":"Fecha y hora","captionAlign":"right","displayValue":"12/03/2014 07:24 a.m.","emptyValue":"emptyString","height":"30px","readonly":true,"styles":{},"width":"100%"}, {}, {
											binding: ["wm.Binding", {}, {}, {
												wire: ["wm.Wire", {"expression":"new Date().getTime()","targetProperty":"dataValue"}, {}]
											}]
										}],
										spacer1: ["wm.Spacer", {"height":"100%","width":"96px"}, {}],
										Registrar_Suceso: ["wm.Button", {"_classes":{"domNode":["Success"]},"border":"1","borderColor":"#22a7f0","caption":"Registrar","desktopHeight":"38px","disabled":true,"height":"38px","styles":{"backgroundColor":"#22a7f0"}}, {"onclick":"Registrar_SucesoClick","onclick1":"Registrar_SucesoClick1"}]
									}]
								}]
							}]
						}]
					}]
				}],
				search_admon_teachers: ["wm.Layer", {"border":"1","borderColor":"","caption":"Docentes y Admons","horizontalAlign":"left","padding":"10","styles":{},"themeStyleType":"ContentPanel","verticalAlign":"top"}, {}, {
					header_search_teachers: ["wm.Panel", {"height":"35px","horizontalAlign":"left","layoutKind":"left-to-right","styles":{"backgroundColor":"#00b16a"},"verticalAlign":"middle","width":"100%"}, {}, {
						searchBox_teachers: ["wm.Text", {"caption":undefined,"changeOnKey":true,"dataValue":undefined,"displayValue":"","height":"30px","maxChars":undefined,"placeHolder":"docente o administrativo","styles":{},"width":"300px"}, {"onchange":"teachersAdmonsSearchSv"}]
					}],
					content_teachers_admons: ["wm.Panel", {"height":"100%","horizontalAlign":"left","styles":{},"verticalAlign":"top","width":"100%"}, {}, {
						TeachersAdmonDojoGrid1: ["wm.DojoGrid", {"columns":[
{"show":true,"field":"codigo","title":"Código","width":"80px","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"idpersona","title":"Idpersona","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":true,"field":"nombres","title":"Nombres","width":"100%","align":"left","formatFunc":"","expression":"${apellidos}+\" \"+${nombres}","mobileColumn":false},
{"show":false,"field":"apellidos","title":"Apellidos","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":true,"field":"tipo","title":"Rol","width":"150px","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"idtipo","title":"Idtipo","width":"100%","align":"left","formatFunc":"","mobileColumn":false},
{"show":false,"field":"PHONE COLUMN","title":"-","width":"100%","align":"left","expression":"\"<div class='MobileRowTitle'>\" +\n\"Código: \" + ${codigo} +\n\"</div>\"\n\n+ \"<div class='MobileRow'>\" +\n\"Nombres: \" + ${wm.runtimeId}.formatCell(\"nombres\", ${nombres}, ${this}, ${wm.rowId})\n + \"</div>\"\n\n+ \"<div class='MobileRow'>\" +\n\"Rol: \" + ${tipo}\n + \"</div>\"\n\n+ \"<div class='MobileRow'>\" +\n\"Tipo: \" + ${tipodocumento}\n + \"</div>\"\n\n+ \"<div class='MobileRow'>\" +\n\"No. documento: \" + ${numeroDocumento}\n + \"</div>\"\n\n","mobileColumn":true},
{"show":true,"field":"tipodocumento","title":"Tipo","width":"60px","align":"left","formatFunc":"","mobileColumn":false},
{"show":true,"field":"numeroDocumento","title":"No. documento","width":"120px","align":"left","formatFunc":"","mobileColumn":false}
],"dsType":"com.aprendoz_desarrollodb.data.output.GetTeachersDetailsRtnType","height":"300px","margin":"0","minDesktopHeight":60,"singleClickEdit":true,"styles":{}}, {"onSelect":"TeachersAdmonDojoGrid1Select","onSelect1":"TeachersAdmonDojoGrid1Select1"}, {
							binding: ["wm.Binding", {}, {}, {
								wire: ["wm.Wire", {"expression":undefined,"source":"teachersAdmonsSearchSv","targetProperty":"dataSet"}, {}]
							}]
						}],
						liveFormOuterPanel1: ["wm.Panel", {"height":"100%","layoutKind":"left-to-right","margin":"0,0,0,0","padding":"0,10,10,10","styles":{},"width":"100%"}, {}, {
							liveFormInnerPanel1: ["wm.Panel", {"border":"1","height":"100%","padding":"0,20,20,20","roles":["7","10"],"styles":{"borderRadius":"15px","backgroundColor":"#eee"},"width":"100%"}, {}, {
								insertLogForm2: ["wm.LiveForm", {"height":"233px","horizontalAlign":"center","layoutKind":"left-to-right","padding":"15,0,0,0","styles":{},"verticalAlign":"top"}, {"onError":"errorInsercion","onSuccess":"registroInsertado"}, {
									fotoAdmon: ["wm.Picture", {"_classes":{"domNode":["roundedImg"]},"aspect":"v","border":"1","borderColor":"#bbb","height":"190px","source":"resources/images/default.png","styles":{},"width":"200px"}, {}],
									spacer3: ["wm.Spacer", {"height":"48px","width":"36px"}, {}],
									panel2: ["wm.Panel", {"border":"1","borderColor":"#494343","height":"200px","horizontalAlign":"right","margin":"5","padding":"5","styles":{"borderRadius":"5px","backgroundColor":"#ffffff"},"verticalAlign":"top","width":"299px"}, {}, {
										tipoSuceso1: ["wm.SelectMenu", {"caption":"Evento","captionAlign":"right","dataField":"idTipoFalla","dataType":"com.aprendoz_desarrollodb.data.TipoFalla","dataValue":undefined,"displayField":"tipoFalla","displayValue":"","height":"30px","styles":{},"width":"100%"}, {}, {
											binding: ["wm.Binding", {}, {}, {
												wire: ["wm.Wire", {"expression":undefined,"source":"lsTipoSucesos","targetProperty":"dataSet"}, {}]
											}]
										}],
										dateTime2: ["wm.DateTime", {"caption":"Fecha y hora","captionAlign":"right","displayValue":"12/03/2014 07:24 a.m.","emptyValue":"emptyString","height":"30px","readonly":true,"width":"100%"}, {}, {
											binding: ["wm.Binding", {}, {}, {
												wire: ["wm.Wire", {"expression":"new Date().getTime()","targetProperty":"dataValue"}, {}]
											}]
										}],
										spacer4: ["wm.Spacer", {"height":"100%","width":"96px"}, {}],
										Registrar_Suceso_teachers: ["wm.Button", {"_classes":{"domNode":["Success"]},"border":"1","borderColor":"#51a351","caption":"Registrar","desktopHeight":"38px","disabled":true,"height":"38px","styles":{}}, {"onclick":"Registrar_Suceso_teachersClick","onclick1":"Registrar_Suceso_teachersClick1"}]
									}]
								}]
							}]
						}]
					}]
				}]
			}]
		}]
	}]
}