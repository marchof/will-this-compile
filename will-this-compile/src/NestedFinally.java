/**
 * Will this compile with or without the line "System.out.println(13)"?
 */
public class NestedFinally {

	void nested() {
		try {
			System.out.println(1);
		} finally {
			try {
				System.out.println(2);
			} finally {
				try {
					System.out.println(3);
				} finally {
					try {
						System.out.println(4);
					} finally {
						try {
							System.out.println(5);
						} finally {
							try {
								System.out.println(6);
							} finally {
								try {
									System.out.println(7);
								} finally {
									try {
										System.out.println(8);
									} finally {
										try {
											System.out.println(9);
										} finally {
											try {
												System.out.println(10);
											} finally {
												try {
													System.out.println(11);
												} finally {
													try {
														System.out.println(12);
													} finally {
														// System.out.println(13);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

}
