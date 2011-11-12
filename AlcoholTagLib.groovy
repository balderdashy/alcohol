/**
 *  Makes your date prettier
 */
class AlcoholTagLib {

	/**
	 * Output to view
	 */
	def alcohol = { attrs, body ->
		def formattedDate = format(attrs.date)
		out << formattedDate
	}

	/**
	 * Magic sauce
	 */
	private format( Date d ) {
		def format
		def today = (new Date()).format("ddMMyyyy")
		def day = d.format("ddMMyyyy")
		if (day == today) {
			return "Today, " + d.format("h:mm a")
		}
		else {
			return d.format("MMMM dd, yyyy")
		}
	}

}