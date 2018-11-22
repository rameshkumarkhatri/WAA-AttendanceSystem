$(document)
		.ready(
				function() {

					$("#student-daily-report")
							.click(
									function() {
										$
												.getJSON(
														"http://localhost:8080/student/get/attendance/108191/2018/11/20/AM",
														function(result) {
															$("#daily-report")
																	.append(
																			"<td>1</td>");
															$("#daily-report")
																	.append(
																			"<td>"
																					+ result.student.firstName
																					+ "</td>");
															$("#daily-report")
																	.append(
																			"<td>"
																					+ result.student.lastName
																					+ "</td>");
															$("#daily-report")
																	.append(
																			"<td>"
																					+ result.student.email
																					+ "</td>");
															$("#daily-report")
																	.append(
																			"<td>"
																					+ result.student.phone
																					+ "</td>");
															$("#daily-report")
																	.append(
																			"<td>"
																					+ result.date
																					+ "</td>");
															$("#daily-report")
																	.append(
																			"<td>"
																					+ result.shift
																					+ "</td>");
															$("#daily-report")
																	.append(
																			"<td>"
																					+ result.location.locationName
																					+ "</td>");
														});
									});
					$("#faculty-current-block-report")
							.click(
									function() {
										$
												.getJSON(
														"http://localhost:8080/student/get/attendance/108191/2018/11/20/AM",
														function(result) {
															var i = 0
															$
																	.each(
																			result,
																			function(
																					key,
																					tm) {
																				$(
																						"#faculty-current-block-data")
																						.append(
																								"<tr>"
																										+ "<td>"
																										+ (i++)
																										+ "</td>"
																										+ "<td>"
																										+ tm.student.firstName
																										+ "</td>"
																										+ "<td>"
																										+ tm.student.lastName
																										+ "</td>"
																										+ "<td>"
																										+ tm.student.email
																										+ "</td>"
																										+ "<td>"
																										+ tm.student.phone
																										+ "</td>"
																										+ "<td>"
																										+ tm.date
																										+ "</td>"
																										+ "<td>"
																										+ tm.shift
																										+ "</td>"
																										+ "<td>"
																										+ tm.location.locationName
																										+ "</td>"
																										+ "</tr>");
																			})

														});
									});
					$("#btnnews").click(
							function() {
								alert("Create Student Button Clicked");

								var newStudent = {
									"studentId" : $("#student-id").val(),
									"firstName" : $("#student-first-name")
											.val(),
									"lastName" : $("#student-last-name").val(),
									"email" : $("#student-email").val(),
									"phone" : $("#student-phone").val()
								};
								alert(newStudent);
								$.post(
										"http://localhost:8080/student/create",
										newStudent,
										function(data, status, xhr) {

											alert('status: ' + status
													+ ', data: ' + data);

										}).done(function() {
									alert('Request done!');
								}).fail(function(jqxhr, settings, ex) {
									alert('failed, ' + ex);
								});

							});
				});