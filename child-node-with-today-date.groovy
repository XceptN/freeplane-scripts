// @ExecutionModes({ON_SELECTED_NODE})
// Create a child node with today's date in DK format and navigate to it
today_date = new Date()
today_text = today_date.format("yyyy-MM-dd")
child_node = node.createChild(today_text)
c.select(child_node)
